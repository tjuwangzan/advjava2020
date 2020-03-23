package cn.tju.chp05.s02.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("D:" + File.separator + "demo2020" + 
				File.separator + "writer.txt");
		if (!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		Writer wrt = new FileWriter(file);
		String str = "Writer Successful char";
		char[] c = str.toCharArray();
		wrt.write(c);
//		wrt.flush();
//		
		wrt.close();
		
	}

}
