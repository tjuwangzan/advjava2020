package cn.tju.chp02.s03.thisconstrutor;

public class CarConsMain {

	public static void main(String[] args) {
		CarCons car1 = new CarCons("丰田",18.5);
		CarCons car2 = new CarCons("丰田",18.5);
		
		System.out.println(car1.equals(car2));

	}

}
