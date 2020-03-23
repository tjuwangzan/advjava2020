package cn.tju.chp06.s01.reflection;

public class Person implements IPerson {
	public String gender;
	private int height;
	private double weight;
	public String name;
	public int age;
	
	public Person() {}

	@Override
	public int AddAge(int age) {
		return age + 1;
	}

}
