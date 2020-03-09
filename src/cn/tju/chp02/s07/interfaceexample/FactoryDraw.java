package cn.tju.chp02.s07.interfaceexample;

public class FactoryDraw {
	public static Drawable5 getInstance(String drawName) {
		if ("rectangle".equals(drawName)) {
			return new Rectangle5();
		}else if ("circle".equals(drawName)) {
			return new Circle5();
		}else if ("line".equals(drawName)) {
			return new Line5();
		}else {
			return null;
		}
	} 

}
