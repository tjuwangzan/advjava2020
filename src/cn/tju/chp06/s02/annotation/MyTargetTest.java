package cn.tju.chp06.s02.annotation;
@MyTarget("hello")
public class MyTargetTest {
	@MyTarget("hello")
	public void doSomething() {
		System.out.println("Hello World!");
	}

}
