package cn.tju.chp04.s01.generic;

public class WildCardExtendsDemo {
	public static void main(String[] args) {
		Message<Integer> m1 = new Message<Integer>();
		Message<String> m2 = new Message<String>();
		Message<Double> m3 = new Message<Double>();
		m1.setMsg(100);
		m2.setMsg("hello wolrd!");
		m3.setMsg(78.2);
		
		fun(m1);
//		fun(m2);
		fun(m3);
	}
	
	public static void fun(Message<? extends Number> tmp) {
		System.out.println(tmp.getMsg());
	}

}
