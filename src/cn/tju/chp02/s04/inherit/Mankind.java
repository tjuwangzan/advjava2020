package cn.tju.chp02.s04.inherit;

class Man extends Animal {
	private int iq = 120;
	private int height = 170;
	
	public Man() {
		System.out.println("Man类执行了");
	}
	
	public void talk() {
		System.out.println("Hello");
	}
	
	public void showParentHeight() {
		System.out.println(this.height);
	}
		
}


public class Mankind{
	public static void main(String[] args) {
		Man man = new Man();
		Man man2 = new Man();
		man.talk();
		man.showParentHeight();
		
//		System.out.println(man2.equals(man));
//		System.out.println(man);
	}
} 
