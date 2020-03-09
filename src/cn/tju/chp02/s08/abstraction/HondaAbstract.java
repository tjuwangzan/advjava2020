package cn.tju.chp02.s08.abstraction;

abstract class BikeAbstract{
	public BikeAbstract() {
		System.out.println();
	}
	abstract void run();
	abstract void play();
}

public class HondaAbstract extends BikeAbstract{
	@Override
	void run(){
		System.out.println("running safely..");
	}
	
	public static void main(String[] args) {
		BikeAbstract bike = new HondaAbstract();
		bike.run();
		

	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

}
