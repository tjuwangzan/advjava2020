package cn.tju.chp02.s09.exception;

class MyMath{
	public static int div(int x, int y) throws ArithmeticException{
		int result = 0;
		System.out.println("Divide start...");		
		try{
			result = x / y;
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			System.out.println("Divide end");
			return result;
		}	
	}
}

public class ExceptUseDemo {

	public static void main(String[] args)  {
		System.out.println(MyMath.div(10, 0));
		System.out.println("test");

	}

}
