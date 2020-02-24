package cn.tju.chp02.s06.infinal;

public class BikeDemo {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(1,2,3);
//		System.out.println(mb.test);
		
		Object obj = new MountainBike(2, 3, 4);
		
		mb = (MountainBike) obj;

	}

}
