package cn.tju.chp02.s05.staticexample;

public class StudentStatic {
	 int rollno;  
	 String name;  
	 static String college ="ITS";  
	     
	 StudentStatic(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){
		 System.out.println(rollno+" "+name+" "+college);
		 }  
	  
	 public static void main(String args[]){  
		 StudentStatic s1 = new StudentStatic(111,"AAA");  
		 StudentStatic s2 = new StudentStatic(222,"BBB");  
		   
		 s1.display();  
		 s2.display();  
	 }  

	
}
