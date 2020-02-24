package cn.tju.chp02.s01.objectclass;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		car.name = "大众";
		car.price = 20.5;		
		car.getCarInfo();
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
		}
		
	}
	
}
