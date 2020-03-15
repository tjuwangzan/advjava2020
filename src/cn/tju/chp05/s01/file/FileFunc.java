package cn.tju.chp05.s01.file;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;



public class FileFunc {
	public static void main(String[] args) {
		File file = new File("e:" + File.separator + "demo2" + File.separator + "testpic.jpg");
		
		if (file.exists()) {
			System.out.println("是否是文件：" + file.isFile());
			System.out.println("是否是目录：" + file.isDirectory());
			System.out.println("上次修改时间原格式：" + file.lastModified());
			System.out.println("上次修改时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
			System.out.println(file.length());
			System.out.println("文件大小：" + new BigDecimal((double)file.length()/1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP) +"M");
		}
	}

}
