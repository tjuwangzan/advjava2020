package cn.tju.chp05.s02.io;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;

public class SystemDemo {

	public static void main(String[] args) throws Exception {
		try{
			Integer.parseInt("abc");
		} catch(Exception e){
			
			
			System.err.println(e);
			System.out.println("-----------------");
			System.out.println(e);
			System.out.println("-----------------");
//			e.printStackTrace();
			
		}
		
//		System.out.println("天津大学");
//		OutputStream out = System.out;
//		out.write("Tianjin Unviersity".getBytes()); //屏幕输出
		
//		Consumer<String> con = System.out::println;
//		con.accept("fadfa");

	}

}
