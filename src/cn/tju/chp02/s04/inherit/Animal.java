package cn.tju.chp02.s04.inherit;

public class Animal {
	protected int height = 10;
	private int weight = 110;
	
	public Animal() {
		System.out.println("Animal执行了");
		height = 20;
	}
	
	public void talk() {
		System.out.println("aaaa");
	}



	
}
