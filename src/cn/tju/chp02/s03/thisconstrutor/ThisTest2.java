package cn.tju.chp02.s03.thisconstrutor;

class Father{
	private String name = "父类字段";
	public Father(){
		this.setName("测试");
//		System.out.println(this);
		System.out.println(this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Child extends Father{
	private String name = "子类字段";
	
	public Child() {
//		System.out.println(this);
		System.out.println(this.name);
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	};
}

public class ThisTest2 {

	public static void main(String[] args) {
		Father objFather = new Child();
		Child objChild = new Child();
		System.out.println(objChild.getName());

	}

}
