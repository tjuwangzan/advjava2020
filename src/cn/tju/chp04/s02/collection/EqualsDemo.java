package cn.tju.chp04.s02.collection;

public class EqualsDemo extends Object{

	public static void main(String[] args) {
		int i1 = 40;
		int i2 = 40;
		Integer i3 = 400;
		Integer i4 = 400;
		Integer i5 = 40;
		Integer i6 = 40;
		System.out.println("int and Integer ===================");
		System.out.println("i1 = i2:" + (i1 == i2));   	// true
		System.out.println("i3 = i4:" + (i3 == i4));	// true false?
		System.out.println("i5 = i6:" + (i5 == i6));	// true false?		
		
//		double d1 = 40.4;
//		double d2 = 40.4;
//		Double d3 =  40.5;
//		Double d4 =  40.5;
//		
//		float f1 = 300.23f;
//		float f2 = 300.23f;
//		Float f3 = 300.23f;
//		Float f4 = 300.23f;
//		System.out.println("Double and Float ===================");
//		System.out.println("d1 = d2:" + (d1 == d2));	// true
//		System.out.println("d3 = d4:" + (d3 == d4));	// true false
//		System.out.println("f1 = f2:" + (f1 == f2));	// 
//		System.out.println("f3 = f4:" + (f3 == f4));
//		
//
//		String s1 = "ab";
//		String s2 = "cd";
//		String s3 = "abcd";
//		String s4 = "ab" + "cd";
//		System.out.println("String ===================");
//		System.out.println("s3 = s1 + s2:" + (s3 == (s1 + s2)));
//		System.out.println("s3 = s4:" + (s3 == s4));
//		
//		String s5 = new String("abc");
//		String s6 = new String("abc");
//		System.out.println(s5 == s6);
//		System.out.println(s5.equals(s6));
//		
				
		

	}

}
