package cn.tju.chp05.s01.file;

import java.io.File;
import java.util.Iterator;

public class FileList {

	public static void main(String[] args) {
		File file = new File("D:/abc");
		
		//简单的列出目录下的信息
		String[] names = file.list();
		for (String name : names) {
			System.out.println(name);
		}
		
		
		System.out.println("----------------");
		//列出所有的信息，以File类包装
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
	}

}
