package cn.tju.chp02.s09.exception;

public class ThrowDemo {
	public static void main(String[] args) {
		try {
			throw new Exception("自定义异常！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test");
	}
	
//	public static void main(String[] args) {
//		try {
//			throw new Exception("自定义异常！");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("fadfa");
//	}
}
