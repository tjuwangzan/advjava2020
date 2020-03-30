package cn.tju.chp07.s01.jvm;

public class ConstantDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		
		System.out.print("s1==s2:" );
		System.out.println(s1==s2);
		System.out.print("s1==s3:");
		System.out.println(s1==s3);
		System.out.println(s1==s3.intern());
		
		System.out.println("-----------");
		
		String s4 = "ab";
		String s5 = "c";
		String s6 = "ab" + "c";
		String s7 = s4 + s5;
		System.out.println(s6 == s1);
		System.out.println(s7 == s1);
	}

}
