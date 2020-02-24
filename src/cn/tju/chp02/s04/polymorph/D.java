package cn.tju.chp02.s04.polymorph;

public class D extends A{
	private String msg;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void fun() {
		
		System.out.println("B类中的fun方法");
	}

}
