package cn.tju.chp07.s01.jvm;

import java.util.ArrayList;
import java.util.List;

public class JconsoleTest {
	public byte[] b = new byte[128*1024];
	public static void main(String[] args) {
		fill(1000);
	}

	private static void fill(int n)  {
		List<JconsoleTest> jlist = new ArrayList<>();
		for (int j = 0; j < n; j++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jlist.add(new JconsoleTest());
		}
		
	}

}
