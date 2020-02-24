package cn.tju.chp02.s08.abstraction;

abstract class ShapeAC{
	abstract void draw();
}

class RectangleAC extends ShapeAC{
	@Override
	void draw() {
		System.out.println("drawing rectangle");
	}	
}

class CircleAC extends ShapeAC{
	@Override
	void draw() {
		System.out.println("drawing Circle");		
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		ShapeAC s = new CircleAC(); 
		s.draw();
	}

}
