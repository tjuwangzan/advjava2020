package cn.tju.chp07.s01.jvm;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = "abc";
		
		if (str1 == str2) {
			System.out.println("str1 == str2");
		} else {
			System.out.println("str1 != str2");
		}
		
		String str3 = "abc";
		if (str2 == str3) {
			System.out.println("str2 == str3");
		} else {
			System.out.println("str2 != str3");
		}
		
		str1 = str1.intern();
		if (str1 == str2) {
			System.out.println("str1 == str2");
		} else {
			System.out.println("str1 != str2");
		}
		
		String str4 = new String("abc");
		str4 = str4.intern();
		if (str1 == str4) {
			System.out.println("str1 == str4");
		} else {
			System.out.println("str1 != str4");
		}
		}

}
