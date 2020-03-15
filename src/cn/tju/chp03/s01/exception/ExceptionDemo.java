package cn.tju.chp03.s01.exception;

public class ExceptionDemo {

	//1. 异常不处理的情况
//	public static void main(String[] args) {
//		System.out.println("1. Division start...");
//		System.out.println("2. Division:" + (10/0));
//		System.out.println("3. Division End");
//	}
	
	//2. 处理异常的情况，try-catch、try-catch-finally、try-finally
	public static void main(String[] args) {
		System.out.println("1. Division start...");
		try {
			System.out.println("2. Division:" + (10/0));
		} catch(Exception e) {
			e.printStackTrace();
//			System.out.println(e);
		}
		System.out.println("3. Division End");

	}
	
	//3.也可以通过打印e
//	public static void main(String[] args) {
//		System.out.println("1. Division start...");
//		try {
//			System.out.println("2. Division:" + (10/0));
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
//		System.out.println("3. Division End");
//		
//	}

}
