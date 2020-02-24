package cn.tju.chp02.s08.abstraction;

abstract class BikeAbstract{
	abstract void run();
}

public class HondaAbstract extends BikeAbstract{
	void run(){
		System.out.println("running safely..");
	}

	public static void main(String[] args) {
		BikeAbstract bike = new HondaAbstract();
		bike.run();

	}

}
