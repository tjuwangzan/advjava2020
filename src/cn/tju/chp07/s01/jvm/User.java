package cn.tju.chp07.s01.jvm;

public class User {
	private String name;
	private int age;
	private boolean flag;
	
	public User() {
		System.out.println("User created success!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "name = " + this.name + ",age =" +  this.age + ",flag=" + flag ;
	}
	

}
