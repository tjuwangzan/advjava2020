package cn.tju.chp05.s02.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
//		1.从System.in读数据
//		（1）. System.in是InputStream类对象
//		（2）. BufferedRead的构造方法里面需要Reader的对象
//		（3）. 利用InputStreamReader将字节流转换为字符流
//		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("请输入数据：");
//		String str = buf.readLine();
//		System.out.println("输入的内容：" + str);
		
//		2.读取数字
//		boolean flag = true;
//		while (flag){
//			System.out.print("请输入年龄：");
//			String str = buf.readLine();
//			if (str.matches("\\d{1,3}")){
//				System.out.println("年龄是：" + Integer.parseInt(str));
//				flag = false;
//			} else {
//				System.out.println("年龄输入错误！");
//			}
//		}
		
//		3.从文件中读取
		File file = new File("D:" + File.separator + "demo2020" + File.separator + "buffer.txt");
		// 使用文件输入流实例化BufferedReader类对象
		BufferedReader buf = new BufferedReader(new FileReader(file));
		String str = null;			// 接收输入数据
		while ((str = buf.readLine()) != null) {	// 读取数据并判断是否存在
			System.out.println(str);	// 输出读取内容
		}
		buf.close();	
		

	}

}
