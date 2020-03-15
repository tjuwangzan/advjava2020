package cn.tju.chp05.s02.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("E:\\demo2019\\buffers.txt"));
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int c = 0;
		System.out.println(bis.read());
		System.out.println(bis.read());
		
		System.out.println("----------------------");
		bis.mark(100);
		for (int i = 0; i <=10 && (c=bis.read())!=-1; i++) {
			System.out.print(c+ " ");
		}
		
		System.out.println("");
		
		bis.reset();
		for (int i = 0; i <=10 && (c=bis.read())!=-1; i++) {
			System.out.print(c+ " ");
		}
		bis.close();
	

	}

}
