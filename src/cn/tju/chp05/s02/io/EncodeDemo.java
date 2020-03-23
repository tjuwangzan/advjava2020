package cn.tju.chp05.s02.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
//		System.getProperties().list(System.out);
		File file = new File("D:" + File.separator + "demo2020" + File.separator + "encode.txt");
		OutputStream os = new FileOutputStream(file);
		
		os.write("中国加油".getBytes("UTF-8"));
		os.close();

	}

}
