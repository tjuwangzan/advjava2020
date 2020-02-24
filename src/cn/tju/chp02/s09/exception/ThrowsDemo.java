package cn.tju.chp02.s09.exception;

class MathThrow{
	public static int div(int x, int y) throws Exception {
		return x/y;
	}
}

public class ThrowsDemo {
	public static void main(String[] args)  {
//		try {
//			System.out.println(MathThrow.div(10, 0));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			System.out.println(MathThrow.div(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("tsss");
	}
}
