package cn.tju.chp05.s02.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("D:" + File.separator + "demo2020" + 
				File.separator + "test.txt");
		if (!file.exists()) {
			System.out.println("没有指定的文件");
			return;
		}
//		1. read()
		if (file.exists()){
			InputStream is = new FileInputStream(file);
			byte data[] = new byte[1024];
			int foot = 0;
			int temp = 0;
			while((temp = is.read())!=-1) {
				data[foot++] = (byte) temp;
			}
			is.close();
			String str = new String(data,0,foot);
			System.out.println(str);			
		}
//		 2. read(Byte[]) 将读取的数据
//		if (file.exists()){
//			InputStream is = new FileInputStream(file);
//			byte data[] = new byte[1024];
//			int lenth = is.read(data);
//			String str = new String(data,0,lenth);
//			System.out.println(str + "/end");
//		}
	
		
		// 3. read do while
		
//		if (file.exists()) {
//			InputStream iso = new FileInputStream(file);
//			byte data[] = new byte[1024];
//			int foot = 0;
//			int temp = 0;
//			do {
//				temp = iso.read();
//				if (temp != -1) {
//					data[foot++] = (byte)temp;
//				}
//			} while(temp !=-1);
//			String str = new String(data);
//			System.out.println("(" + str + ")");
//			
//		}
		
	}

}
