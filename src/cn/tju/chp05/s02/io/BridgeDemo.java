package cn.tju.chp05.s02.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BridgeDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("D:" + File.separator + "demo2020" + 
				File.separator + "writeroutput.txt");
		if (!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		OutputStream output = new FileOutputStream(file);
		//将OutputStream类对象传递给OutputStreamWriter类的构造方法，而后向上转型为Writer
		Writer wrt = new OutputStreamWriter(output);
		
		wrt.write("OurputStream Writer");
		wrt.close();
		
	}

}
