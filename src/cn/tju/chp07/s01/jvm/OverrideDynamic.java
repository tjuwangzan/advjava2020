package cn.tju.chp07.s01.jvm;

public class OverrideDynamic {
	
	static class Parent{
		public void sayHello() {
			System.out.println("parent");
		}
	}
	
	static class Child1 extends Parent{
		@Override
		public void sayHello() {
			System.out.println("Child1");
		}
		
	}
	
	static class Child11 extends Child1{
		@Override
		public void sayHello() {
			System.out.println("Child11");
		}
	}
	
	static class Child2 extends Parent{
		@Override
		public void sayHello() {
			System.out.println("Child2");
		}
	}
	
		
	public static void main(String[] args) {
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		Parent p11 = new Child11();
		
		
		p1.sayHello();
		p2.sayHello();
		p11.sayHello();
	
	}

}
