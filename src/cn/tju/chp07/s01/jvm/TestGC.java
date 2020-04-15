package cn.tju.chp07.s01.jvm;

public class TestGC {

	public static void main(String[] args) {
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b = new byte[10*1024*1024];
		}

	}

}
