package cn.tju.chp02.s07.interfaceexample;

interface Printable3{
	void print();
}

interface Showable3 extends Printable3{
	void show();
}


public class InterfaceExtends implements Showable3{
	public void print(){
		System.out.println("Hello");
	}
	
	public void show(){
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		InterfaceExtends ie = new InterfaceExtends();
		ie.print();
		ie.show();

	}

}
