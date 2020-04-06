package cn.tju.chp07.s01.jvm;

class SingletonCase{
	 public static int counter1;     
     public static int counter2 = 0;
     private static SingletonCase singletonCase = new SingletonCase();
     public static int counter3 = 0;
     public static int counter4;     
	 private SingletonCase()	 {
		 counter1++;
		 counter2++;
		 counter3++;
		 counter4++;
	 }	 
	 public static SingletonCase getInstance()	 {
		 return singletonCase;
		 }
}

public class Singleton {	
	public static void main(String[] args) {
		SingletonCase singleton = SingletonCase.getInstance();
		System.out.println(singleton.counter1);
		System.out.println(singleton.counter2);
		System.out.println(singleton.counter3);
		System.out.println(singleton.counter4);
	}
	
    
}
