package cn.tju.chp02.s09.exception;

public class ExceptionTryDemo {
	public static void main(String[] args) {
		System.out.println("1. Division start...");
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("2. Division:" + (x/y));
			System.out.println("----------------"); // Not Executed.
		} catch(Exception e) {
			System.out.println("出错了");
			e.printStackTrace();
		} 
//		catch(ArithmeticException e){
//			System.out.println("*****Exception Found**********");
//			e.printStackTrace();
//		} catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("数据越界了");
//			e.printStackTrace();
//		} catch(NumberFormatException e){
//			System.out.println("输入不是数字");
//			e.printStackTrace();
//		} 
		finally{
			System.out.println("$$ No matter whether exception was found or not");
		}
		System.out.println("3. Division End");
	}
}
