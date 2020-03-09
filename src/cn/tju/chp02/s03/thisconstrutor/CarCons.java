package cn.tju.chp02.s03.thisconstrutor;

public class CarCons {
	private String name;
	private double price;
	
	public CarCons() {
		System.out.println("构造了一个新的Car");
	}
	
	public CarCons(String name) {
		this();
		this.setName(name);
	}
	
	public CarCons(String name, double price) {
		this.name = name;
		this.price = price;
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
		this.price = price;
	}
	
	void getCarInfo(){
		System.out.println("汽车名称："+ getName() + "，汽车价格：" + getPrice());
	}

	@Override
	public String toString() {
		return "CarCons [name=" + name + ", price=" + price + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarCons other = (CarCons) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	

}
