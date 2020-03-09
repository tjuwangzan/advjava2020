package cn.tju.chp04.s01.generic;

public class GeneticFoo<T> {
	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		GeneticFoo<String> foo1 = new GeneticFoo<>();
		GeneticFoo<Integer> foo2 = new GeneticFoo<>();
		foo1.setFoo(new String("fafafa"));
		foo2.setFoo(122);
		
		System.out.println(foo1.getFoo());
		System.out.println(foo2.getFoo());
		
		GeneticFoo a = new GeneticFoo();
		
	}
	

}
