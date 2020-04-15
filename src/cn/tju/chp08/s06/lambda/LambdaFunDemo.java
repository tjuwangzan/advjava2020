package cn.tju.chp08.s06.lambda;

interface IMessage{
	public void print();
}

public class LambdaFunDemo {
	public static void main(String[] args) {
//		IMessage msg = new IMessage() {
//			
//			@Override
//			public void print() {
//				System.out.println("Hello World!");
//			}
//		};
//		
//		fun(msg);
		
	
		
		
		fun(()->System.out.println("Hello Wrold!"));
		
	}
	
	public static void fun(IMessage msg) {
		msg.print();
	}

}
