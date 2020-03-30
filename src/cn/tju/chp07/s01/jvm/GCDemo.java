package cn.tju.chp07.s01.jvm;

public class GCDemo {
	public static void main(String[] args) {
		{
			byte[] buff = new byte[600*1024*1024];
		}
		
		int a = 10;
		System.gc();
	}

}
