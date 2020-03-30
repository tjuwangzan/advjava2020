package cn.tju.chp06.s01.reflection;

class CarRef{
	public CarRef(){
		System.out.println("******Car类的无参构造方法***********");
	}
	
	@Override
	public String toString() {
		return "This is a car!";
	}
	
	public void run() {
		System.out.println("车在跑");
	}
}

public class ReflectionInstantiation {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("cn.tju.chp06.s01.reflection.CarRef");
		Object obj = clazz.newInstance();
		((CarRef) obj).run();
		

	}

}
