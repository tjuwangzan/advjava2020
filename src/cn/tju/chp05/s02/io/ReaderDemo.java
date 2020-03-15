package cn.tju.chp05.s02.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("D:" + File.separator + "demo2020" + 
				File.separator + "writer.txt");
//		1.读取内容到字符数组
//		if (file.exists()){
//			Reader in = new FileReader(file);
//			char data[] = new char[1024];
//			int lenth = in.read(data);
//			in.close();
//			String str = new String(data, 0, lenth );
//			System.out.println(str + "END");
//		}
		
//		2.单个读取
		if (file.exists()) {
			Reader in = new FileReader(file);
			char data[] = new char[1024];
			int temp = 0;
			int foot = 0;
			while((temp = in.read())!=-1) {
				data[foot++] = (char) temp;
			}
			in.close();
			String str = new String(data,0,foot);
			System.out.println(str + "/END");
		}
	}

}
