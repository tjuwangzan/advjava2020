package cn.tju.chp02.s09.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("1. Division start...");
		try {
			System.out.println("2. Division:" + (10/0));
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("3. Division End");

	}
	
//	public static void main(String[] args) {
//		System.out.println("1. Division start...");
//		try {
//			System.out.println("2. Division:" + (10/0));
//		} catch (ArithmeticException e) {
////			System.out.println(e);
//			e.printStackTrace();
//		}
//		System.out.println("3. Division End");
//		
//	}

}
