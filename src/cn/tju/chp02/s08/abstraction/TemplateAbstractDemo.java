package cn.tju.chp02.s08.abstraction;

public class TemplateAbstractDemo {

	public static void main(String[] args) {
//		fun(new Robot());
//		fun(new Person());
//		fun(new Dog());
		fun(new Person());

	}
	
	public static void fun(Action a) {
//		a.command(Action.EAT);
//		a.command(Action.SLEEP);
//		a.command(Action.WORK);
		a.command(8);
	}

}
