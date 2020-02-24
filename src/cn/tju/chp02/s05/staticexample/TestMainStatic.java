package cn.tju.chp02.s05.staticexample;
public class TestMainStatic {
	public static void main(String[] args) {
		CarStatic car1 = new CarStatic();
		CarStatic car2 = new CarStatic();
		car1.setName("大众");
		car1.setPrice(-20.5);
		car1.setBirthplace("德国");
		car2.setName("丰田");
		car2.setPrice(18);
		car2.birthplace = "中国";
		car1.getCarInfo();
		car2.getCarInfo();
		
		System.out.println(car1.birthplace);
	}
}
