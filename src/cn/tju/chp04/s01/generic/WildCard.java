package cn.tju.chp04.s01.generic;

import java.util.HashMap;
import java.util.List;

public class WildCard<T> {
	private T foo;
	
	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		WildCard<?> ge = new WildCard<Integer>();
//		ge.setFoo();
		
		
		WildCard<String> ge2 = new WildCard<String>();
		ge2.setFoo("Hello world");
		
		ge = ge2;
		
		System.out.println(ge.getFoo());
	
		
		
	}


}
