package cn.tju.chp07.s01.jvm;

import java.util.Random;

class FinalTest{
//	public static final int x = 6/3;
	public static final int y = new Random().nextInt(10);
	static
	{
		System.out.println("FinalTest Static Block");
	}
}
public class FinalTestDemo {
	public static void main(String[] args) {
		System.out.println(FinalTest.y);
	}

}
