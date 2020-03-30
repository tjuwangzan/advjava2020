package cn.tju.chp07.s01.jvm;

public class StackTest {
	private void test() {
		System.out.println("方法执行");
		test();
	}
	
	public static void main(String[] args) {
		new StackTest().test();
	}
	

}
