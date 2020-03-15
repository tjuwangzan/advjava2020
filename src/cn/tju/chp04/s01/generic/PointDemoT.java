package cn.tju.chp04.s01.generic;

class Point2<T> extends Object{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}

public class PointDemoT {
	public static void main(String[] args) {
		Point2<Double> p = new Point2<Double>(); //JDK1.7之后实例化的泛型可以省略
		p.setX(10.2);
		p.setY(20.2);
		
		double x = p.getX();
		double y = p.getY();
		
		System.out.println("x坐标："+x + ",  y坐标：" + y);
		
//		p.setX("东经30");
//		p.setY("北纬20");
		
	
//		p.setY(20);
		
//		String x = (String)p.getX(); //有必要向下转型吗？
//		String y = (String)p.getY();
		
//		String x = p.getX();
//		String y = p.getY();
		
		
	}
}
