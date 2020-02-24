package cn.tju.chp02.s08.abstraction;

public class Dog extends Action {

	@Override
	public void eat() {
		System.out.println("狗在啃骨头！");
	}

	@Override
	public void sleep() {
		System.out.println("狗在打盹！");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

}
