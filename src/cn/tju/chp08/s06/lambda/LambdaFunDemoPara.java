package cn.tju.chp08.s06.lambda;

interface IMessagePara{
	public void print(String str);
}

public class LambdaFunDemoPara {
	public static void main(String[] args) {
//		fun(new IMessage() {
//			
//			@Override
//			public void print() {
//				System.out.println("Hello World!");
//			}
//		});
		
		fun((String s)->System.out.println(s));
	}
	
	public static void fun(IMessagePara msg) {
		msg.print("Hello World!");
	}

}
