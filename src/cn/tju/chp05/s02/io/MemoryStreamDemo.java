package cn.tju.chp05.s02.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MemoryStreamDemo {

	public static void main(String[] args) throws Exception {
		String str = "Hello*World!!";
		
		//通过内存操作流实现转换。先将数据保存在内存流里面，而后从里面取出每一个数据
		//将所有要读取的数据设置到内存输入流之中
		InputStream input = new ByteArrayInputStream(str.getBytes());
		OutputStream output = new ByteArrayOutputStream();
		
		int temp = 0;

		
		while((temp = input.read())!=-1){
			System.out.print((char)temp);
			output.write(Character.toUpperCase(temp));
		}
		
		input.close();
		output.close();
		
		System.out.println("");
		System.out.println(output);
		System.out.println(str.toUpperCase());
		

	}

}
