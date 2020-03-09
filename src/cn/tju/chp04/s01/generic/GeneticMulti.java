package cn.tju.chp04.s01.generic;

public class GeneticMulti<T1,T2> {
	private T1 foo1;
	private T2 foo2;
	public T1 getFoo1() {
		return foo1;
	}
	public void setFoo1(T1 foo1) {
		this.foo1 = foo1;
	}
	public T2 getFoo2() {
		return foo2;
	}
	public void setFoo2(T2 foo2) {
		this.foo2 = foo2;
	}
	
	public static void main(String[] args) {
		GeneticMulti<Integer, Boolean> foo = new GeneticMulti<>();
		
		foo.setFoo1(new Integer(-20));
		foo.setFoo2(new Boolean(false));
		
		System.out.println(foo.getFoo1());
		System.out.println(foo.getFoo2());
	}

}
