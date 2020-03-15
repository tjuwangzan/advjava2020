package cn.tju.chp05.s01.file;

import java.io.File;
import java.io.IOException;

public class FileFirst {

	public static void main(String[] args) throws IOException {
//		1. File类及exists，delete，及createNewFile方法
		File file = new File("D:\test.txt");
		if(file.exists()) {
			file.delete();
		} else {
			System.out.println(file);
//			System.out.println(file.createNewFile());
		}
		
//		2. seperator
		File file2 = new File("D:" + File.separator + "test.txt");
		if(file2.exists()) {
			file2.delete();
		} else {
			System.out.println(file2);
			System.out.println(file2.createNewFile());
		}
		

	}

}
