# Lab3 SQLReflection 实验报告

***Author: 张世琦（3018216185）***

## 一、任务描述

### 1. 实验目标

使用多线程编程技术，编写矩阵乘法。

### 2. 实验要求

- 编写矩阵随机生成类 `MatrixGenerator` 类，随机生成任意大小的矩阵，矩阵单元使用 double 存储。

- 使用串行方式实现矩阵乘法。

- 使用多线程方式实现矩阵乘法。

- 比较串行和并行两种方式使用的时间，利用第三次使用中使用过的 jvm状态查看命令，分析产生时间差异的原因是什么。



## 二、详细设计

### 1.  目标矩阵单值计算函数

考虑 m*p 矩阵 $A$，p\*n 矩阵 $B$ 相乘得到 m\*n 矩阵 $C$。对于矩阵 $C$ 中的每一项 $C[i][j]$ 有如下计算式：
$$
C[i][j] = \sum_{x=0}^p A[i][x]*B[x][j]
$$
从而产生如下函数，计算目标矩阵中指定位置的值：

```java
private static double 
compute(int res_row, int res_col, double[][] mat1, double[][] mat2){
    double res = 0;
    for (int i = 0; i < 5; i++) 
        res += mat1[res_row][i] * mat2[i][res_col];
    return res;
}
```

该方法为私有的，仅能被类中其它函数调用。

### 2. 串行矩阵乘法

```java
public static double[][] 
sgCompute(int resRow, int resCol, double[][] mat1, double[][] mat2){
    double[][] res = new double[resRow][resCol];
    Date start = new Date();
    for (int i = 0; i < resRow; i++)
    {
        for (int j = 0; j < resCol; j++) res[i][j] = compute(i, j, mat1, mat2);
    }
    Date end = new Date();
    long count = end.getTime() - start.getTime();
    System.out.println("[sgCompute finished in " + count + " ms]" );
    return res;
}
```

调用单值计算函数，计算目标矩阵的每一个元素并返回目标矩阵。

### 3. 多线程矩阵乘法

```java
public class MultiCompute extends Thread {
    private static double[][] res;
    private static int run_cnt = -1;
    private static int threadNum = 1;
    private int resRow, resCol, cnt;
    private double[][] mat1;
    private double[][] mat2;
    
    // ...
}
```

通过继承 `Thread` 的方式创建了一个新类。考虑到重载的 `run()` 方法不能传入任何参数，将乘法中需要的所有变量都在成员变量中给出，并要求传入矩阵进行初始化填充所有的变量域。

在初始化时，如果行列不匹配则抛出错误，如下所示：

```java
public MultiCompute(MatrixGenerator m1, MatrixGenerator m2) {
    if (m1.col != m2.row) throw new Error("Invalid row-column size");
	// ...
}
```

从而在重载 `run()` 方法时就会非常的简单、优雅：

```java
@Override
public void run() {
    run_cnt++;
    for (int i = run_cnt; i < resRow; i+=threadNum)
    {
        for (int j = 0; j < resCol; j++) res[i][j] = compute(i, j);
    }
}
```

在测试类中，以双线程运行计算矩阵的乘积：

```java
MultiCompute m1 = new MultiCompute(mg1, mg2);
MultiCompute m2 = new MultiCompute(mg1, mg2);

MultiCompute.setThreadNum(2);
Date start = new Date();
m1.start();
m2.start();

m1.join();
m2.join();
Date end = new Date();
```



##  三、运行结果与分析

考虑到简洁性，对于线程的数量仅测试了双线程与四线程

### 1. 小规模矩阵

![image-20200422100547004](C:\Users\Steven\AppData\Roaming\Typora\typora-user-images\image-20200422100547004.png)

可见，若规模过小，则多线程的时间可能慢于单线程的时间，因为创建、销毁线程仍需要一定的时间

### 2. 中等规模矩阵

![image-20200422100304855](C:\Users\Steven\AppData\Roaming\Typora\typora-user-images\image-20200422100304855.png)

规模中等时，多线程的速度要大大快于单线程的速度。特别的，在测试的 环境中，双线程的用时几乎是单线程的一半。

### 3. 较大规模矩阵

![image-20200422100448053](C:\Users\Steven\AppData\Roaming\Typora\typora-user-images\image-20200422100448053.png)

当规模较大时，多线程的速度仍旧快于单线程的速度，而且十分明显。

## 四、问题 与反思

我在调试时遇到了这个问题：多线程的速度居然远远慢于单线程的速度：

![image-20200422101332681](C:\Users\Steven\AppData\Roaming\Typora\typora-user-images\image-20200422101332681.png)

后来仔细看了看大佬的代码，才发现自己在 `run()` 中有 sout 语句，从而在多线程时存在大量的 I/O 操作，耗费了大量的时间。在删除 sout 代码行后，一切正常。