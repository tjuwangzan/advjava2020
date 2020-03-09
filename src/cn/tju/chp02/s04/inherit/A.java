package cn.tju.chp02.s04.inherit;

public class A {
	private String msg;
	
	public A() {
		System.out.println("A类的构造方法" );
	}
	
	public void print() {
		System.out.println("Print A");
		}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void fun() {
		System.out.println("A的方法");
	}
}
