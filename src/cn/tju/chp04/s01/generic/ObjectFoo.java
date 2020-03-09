package cn.tju.chp04.s01.generic;

public class ObjectFoo {
	private Object foo;
	public Object getFoo() {
		return foo;
	}
	public void setFoo(Object foo) {
		this.foo = foo;
	}

	public static void main(String[] args) {
		ObjectFoo foo1 = new ObjectFoo();
		ObjectFoo foo2 = new ObjectFoo();
		
		foo1.setFoo(new Boolean(false));
		Boolean b = (Boolean)foo1.getFoo();
		System.out.println(b);
		
		foo2.setFoo(new Integer(2));
		Integer i = (Integer)foo2.getFoo();
		System.out.println(i);
	}



	

}
