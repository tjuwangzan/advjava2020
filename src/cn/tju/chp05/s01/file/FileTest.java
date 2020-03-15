package cn.tju.chp05.s01.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException  {
//		1. getParentFile()、mkdir()、mkdirs()的用法
		File file = new File("d:" + File.separator+ "demo" + File.separator +"demo2020" + File.separator + "test.txt");
		if (!file.getParentFile().exists()) {
			System.out.println("目录："+ file.getParentFile().mkdirs());
		}
		
		System.out.println("文件创建：" + file.createNewFile());
		
//		2.mkdir()，只能创建一个目录
//		File file = new File("D:" + File.separator + "demo2"+File.separator+"scs2018.txt");
//		
//		if (!file.getParentFile().exists()) {
//			file.getParentFile().mkdir();
//		}
//		if (file.exists()){
//			file.delete();
//		}else{
//			System.out.println(file.createNewFile());
//		}
	}

}
