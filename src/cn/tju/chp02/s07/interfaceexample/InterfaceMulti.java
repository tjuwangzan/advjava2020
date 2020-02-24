package cn.tju.chp02.s07.interfaceexample;

interface Printerable{
	void print();
}

interface Showable{
	void show();
}

public class InterfaceMulti implements Printerable, Showable{
	public void print(){
		System.out.println("Hello");
	}
	
	public void show(){
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		InterfaceMulti im = new InterfaceMulti();
		im.print();
		im.show();

	}

}
