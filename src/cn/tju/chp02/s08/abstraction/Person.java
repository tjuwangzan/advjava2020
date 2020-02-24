package cn.tju.chp02.s08.abstraction;

public class Person extends Action {

	@Override
	public void eat() {
		System.out.println("人在吃饭！");
	}

	@Override
	public void sleep() {
		System.out.println("人在睡觉！");
	}

	@Override
	public void work() {
		System.out.println("人在工作");
	}

}
