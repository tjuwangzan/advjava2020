package cn.tju.chp02.s07.interfaceexample;

interface Drawable5 {
	public void draw();
}

class Rectangle5 implements Drawable5{

	@Override
	public void draw() {
		System.out.println("画矩形");		
	}	
}

class Circle5 implements Drawable5 {
	@Override
	public void draw() {
		System.out.println("画圆形");	
		
	}
}

public class FactoryDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Drawable5 d = new Rectangle5();
//		Drawable5 dcircle = new Circle5();
//		d.draw();
//		
//		dcircle.draw();
//		
//		Drawable5 draw = FactoryDraw.getInstance("rectangle");
//		draw.draw();
		
		Drawable5 drawReflect = FactoryReflect.getInstance("Triangle5");
		drawReflect.draw();
//		

	}

}
