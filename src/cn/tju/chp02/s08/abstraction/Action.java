package cn.tju.chp02.s08.abstraction;

public abstract class Action {
	public static final int EAT=1;
	public static final int SLEEP=5;
	public static final int WORK=7;
	private int test;
	public Action() {
		this.test = 10;
		System.out.println(this.test);
	}
	public void command(int flag) {
		switch (flag) {
		case EAT:
			this.eat();
			break;
		case SLEEP:
			this.sleep();
			break;
		case WORK:
			this.work();
			break;
		case EAT+WORK:
			this.eat();
			this.work();
			break;
		}
	}
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

}
