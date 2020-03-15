package cn.tju.chp04.s01.generic;

public class WildCardDemo {
	public static void main(String[] args) {
		Message<Integer> m1 = new Message<>();
		Message<String> m2 = new Message<>();
		
		m1.setMsg(100);
		m2.setMsg("hello wolrd!");
		
		fun(m1);
		fun(m2);
	}
	
	public static void fun(Message<?> tmp) {
		System.out.println(tmp.getMsg());
	}
	
//	public static void fun(Message<Integer> tmp) {
//		System.out.println(tmp.getMsg());
//	}

}
