package cn.tju.chp02.s06.inheritfinal;

public class BikeFinalInitial {
	final int speedlimit; // blank final variable
	
	public BikeFinalInitial() {
		speedlimit = 100;
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		new BikeFinalInitial();

	}

}
