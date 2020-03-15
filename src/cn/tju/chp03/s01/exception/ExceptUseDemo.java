package cn.tju.chp03.s01.exception;

class MyMath{
//	1. 正常情况下
//	public static int div(int x, int y) {
//		int result = 0;
//		System.out.println("1. Divide start...");	
//		result = x/y;
//		System.out.println("2. Divide end...");
//		return result;
//	}
	
//	2.有问题的情况下，把异常抛给调用处处理
//	public static int div(int x, int y)  throws Exception{
//		int result = 0;
//		System.out.println("1. Divide start...");	
//		result = x/y;
//		System.out.println("2. Divide end...");
//		return result;
//	}
	
//	3. 被调用者能顺利执行完程序，并将异常抛给调用处处理
	public static int div(int x, int y) throws Exception{
		int result = 0;
		System.out.println("1. Divide start...");
		try {
			result = x/y;
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			throw e;
		} finally {
			System.out.println("2. Divide end...");		
		}
		
		System.out.println("3. Program end...");
		return result;
	}
	

}

public class ExceptUseDemo {

	public static void main(String[] args)    {
		
		try {
			System.out.println("主方法--"+MyMath.div(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
//		try {
//			System.out.println(MyMath.div(10, 0));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("主方法执行二");

	}

}
