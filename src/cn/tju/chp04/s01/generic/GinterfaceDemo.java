package cn.tju.chp04.s01.generic;

interface IMessage<T>{//设置泛型接口
	public void print(T t);
}

//1. 子类也继续使用泛型
class MessageImpl<T> implements IMessage<T>{
	public void print(T t) {
		System.out.println(t);
	}
}

//2. 在子类不设置泛型，而为父接口明确地定义一个泛型类型。
//class MessageImpl implements IMessage<String>{
//	public void print(String t) {
//		System.out.println(t);
//	}
//}


public class GinterfaceDemo {

//	public static void main(String[] args) {
//		IMessage<String> msg = new MessageImpl();
//		msg.print("Hello World!");
//	}
	
	public static void main(String[] args) {
		IMessage<Integer> msg = new MessageImpl();
		msg.print(123);

	}

}
