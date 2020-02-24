package cn.tju.chp02.s04.polymorph;

class C extends A{
	public void print(){
		System.out.println("Print C");
	}
}

public class PolyMorphDemo {
//	public static void main(String[] args) {
//		B b = new B();
//		b.print();	
//	}
	
	/**1. 向上转型
	 *  
	 */
//	public static void main(String[] args) {
//		A a = new B();
//		a.print();
//	}
	
	/**2. 向下转型
	 * 
	 */
//	public static void main(String[] args) {
//		A a = new B(); //向上转型
//		B b = (B)a; 
//		b.print();
//	}
	
	
	
//	public static void main(String[] args) {
//		A a = new A();
//		B b = (B)a;
//		b.print();
//	}
	

	
	/**3. 向上转型可以实现参数统一，还可以调用子类覆写后的方法体，
	即同一个方法针对于不同的子类有不同的实现
	*/
//	public static void main(String[] args) {
//		A a1 = new B();
//		A a2 = new C();
//		a1.print();
//		a2.print();
//		
//	}
	
	/**4. 向下转型，父类调用子类的特殊方法
	 * 如果不做向下转型，将用不了子类的新方法
	 * 
	 */
//	public static void main(String[] args) {
//		A a = new B();
////		a.funB(); 
//		B b = (B)a;
//		b.funB();
//		
////		new B().funB();
//		
//		
//	}
	
	/**
	 * 5. 向上转型的主要目标是统一参数
	 */
//	public static void main(String[] args) {
//		fun(new C());
//	}
//	
//	public static void fun(A a) {
//		a.print();
//	}
	

	/**
	 * 6. 向下转型容易出现异常
	 */
	
//	public static void main(String[] args) {
//		A a = new B();
//		if (a instanceof B) {
//			B b = (B)a;
//			b.print();
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(null instanceof A);
}


}
