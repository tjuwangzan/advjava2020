package cn.tju.chp02.s03.thisconstrutor;

public class CarThis {
	private String name;
	private double price;
	
		
//	public CarThis() {
//		System.out.println("一个新的Car产生了");
//	}
//
//	public CarThis(String name) {
//		this();
//		this.name = name;
//		System.out.println("汽车名称："+name);		
//	}
//	
//	public CarThis(String name, double price) {
//		this.name = name;
//		this.price = price;
//		
//	}
	
	void getCarInfo(){
		System.out.println("汽车名称："+ getName() + "，汽车价格：" + getPrice());
	}
	
	void print() {
		this.getCarInfo();
	}
	
	@Override
	public String toString() {
		return "汽车名称："+ this.getName() + "，汽车价格：" + this.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0){
			this.price = price;
		}	
	}
}
