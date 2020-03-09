package cn.tju.chp02.s06.infinal;

public class BikeFinalInitial {
	static final  int speedlimit; // blank final variable
	
	static {
		speedlimit = 1000;
//		speedlimit = 200;
	}
	
	public BikeFinalInitial() {
//		speedlimit = 100;
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		
		new BikeFinalInitial();

	}

}
