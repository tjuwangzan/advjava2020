package cn.tju.chp05.s01.file;

import java.io.File;

public class FileMkdir {
	public static void main(String[] args) {
		File file = new File("D:/abcd/def3");
		System.out.println(file.mkdir()); //单个的目录
		System.out.println(file.mkdirs()); //包含父目录
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		
	}

}
