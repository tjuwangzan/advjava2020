package cn.tju.chp02.s02.encapsulation;
public class CarEnMain {
	public static void main(String[] args) {
		CarEn car = new CarEn("丰田",11);
//		car.name="大众";
		car.setName("大众");
		car.setPrice(-20.5);		
		car.getCarInfo();
	}
}
