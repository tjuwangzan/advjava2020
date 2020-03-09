package cn.tju.chp03.s01.exception;

class MathThrow{
	public static int div(int x, int y) throws Exception {
		return x/y;
	}
}

public class ThrowsDemo {
	public static void main(String[] args)  {

		try {
			System.out.println(MathThrow.div(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("tsss");
	}
	
//	public static void main(String[] args) throws Exception  {
//
//		System.out.println(MathThrow.div(10, 0));
//		
//		System.out.println("tsss");
//	}
}
