package cn.tju.chp05.s02.io;

import java.util.Scanner;

public class ScannerDemo {
//	1. Scanner的基本用法
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入内容：");
//		if (scan.hasNext()) {
//			System.out.println("输入的内容为：" +scan.next());
//		}
//		scan.close();
//	}
	
//	2. Scanner输入数值型
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入数值：");
//		if (scan.hasNextDouble()){
//			System.out.println("输入的数据：" + scan.nextDouble());
//		} else {
//			System.out.println("输入的不是数据");
//		}
//		scan.close();
//	}
	
//	3.在Scanner输入正则表达式验证
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入生日：");
		if (scan.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
			String bir = scan.next("\\d{4}-\\d{2}-\\d{2}");
			System.out.println("输入内容：" + bir);
		} else {
			System.out.println("生日格式错误！");
		}
		
		scan.close();
	}
	
	

}
