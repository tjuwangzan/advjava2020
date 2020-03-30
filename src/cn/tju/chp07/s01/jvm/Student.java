package cn.tju.chp07.s01.jvm;

public class Student {
	private int id;
	private String sname;
	private int age;
	private Computer comp;
	void study() {
		System.out.println("正在用电脑学习:"+comp.brand);
	}
	void play() {
		System.out.println("正在用电脑玩游戏:" + comp.brand);
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.id = 1001;
		stu.sname = "Zhangsan";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		
		stu.comp = c1;
		
		stu.play();
		stu.study();
		
		
	}

}

class Computer{
	String brand;
}
