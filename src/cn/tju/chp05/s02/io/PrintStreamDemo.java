package cn.tju.chp05.s02.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

class PrintUtil{
	private OutputStream output;
	public PrintUtil(OutputStream output) {
		this.output = output;
	}
	
	public void print(int x){
		this.print(String.valueOf(x));
	}
	
	public void print(double x) {
		this.print(String.valueOf(x));
	}
	public void print(String x){
		try {
			output.write(x.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			this.output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {

		
//		1. 自己定义的PrintUtil，可以输出不同类型的值
//		PrintUtil pu = new PrintUtil(new FileOutputStream(new File("D:" + File.separator + "demo2020"+
//				File.separator+"printstream.txt")));
//		pu.print("天津大学\t\n");
//		pu.print("Tianjin University\t\n");
//		pu.print(1+1);
//		pu.print("\t\n");
//		pu.print(1.1 + 1.1);
//		pu.close();
		
//		2. PrintStream(打印字节), PrintWriter(打印字符)
		PrintStream ps = new PrintStream(new FileOutputStream(new File("D:" + File.separator + "demo2020"+
		File.separator+"printstream2.txt")));
		ps.print("天津大学");
		ps.println("Tianjin University");
		ps.println(1+1);
		ps.println(1.1 + 1.1);
		ps.close();
		

	}

}
