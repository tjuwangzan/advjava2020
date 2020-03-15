package cn.tju.chp04.s02.collection;

public class CompareToDemo {
	public static void main(String[] args) {
		System.out.println("abcd".compareTo("cbc"));
		System.out.println(new Integer(7).compareTo(10));
		System.out.println(new Name("a","b").compareTo("c"));
//		System.out.println("abcd");
	}

}
