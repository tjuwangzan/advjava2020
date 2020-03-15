package cn.tju.chp05.s02.io;

public class BinaryTest {
	public static void main(String[] args) {
		byte[] a = new byte[8] ;
		for (int i = 0; i < a.length; i++) {
			a[i]=108;
		}
		char[] b = new char[8];
		for (int i = 0; i < b.length; i++) {
			b[i] = 108;
		}
		System.out.println(new String(a));
		System.out.println(new String(b));
		
		char c = 0;
		c = (char) (-3);
		System.out.println(c);
	}

}
