package cn.tju.chp07.s01.jvm;

import java.util.ArrayList;

import java.util.List;

 

/**

 * @Described：堆溢出测试

 * @VM args:-verbose:gc -Xms20M -Xmx20M -XX:+PrintGCDetails

 * @author wz

 * @FileNmae cn.tju.scs.c03.jvm.HeapOutOfMemory.java

 */

public class HeapOutofMemory {

 

    /**

     * @param args

     * @Author wz

     */

    public static void main(String[] args) {

       List<TestCase> cases = new ArrayList<TestCase>();

       while(true){

           cases.add(new TestCase());

       }

 

    }

 

}

/**

 * @Described：测试用例

 * @author wz

 * @FileNmae cn.tju.scs.c03.jvm.HeapOutOfMemory.java

 */

class TestCase{

   

}


