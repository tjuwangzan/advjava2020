package cn.tju.chp05.s01.file;

import java.io.File;
import java.io.IOException;

public class FileDirectory {

	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator+"demo2");
		File file2 = new File(file,File.separator + "def/directory.txt");
		
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile());
//		if(!file2.exists()) {
//			file2.getParentFile().mkdirs();
//		}
		System.out.println(file2.createNewFile());

	}

}
