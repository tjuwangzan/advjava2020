package cn.tju.chp04.s01.generic;

public class GmethodDemo {
	   public static <U> U[] print(U[] list) {
	                   
//	         for (int i = 0; i < list.length; i++) {
//	            System.out.print(" " + list[i]);     
//	         }        
		   return list;
	      }                                        
	      public static void main(String[] args) {
	         String a[]={"a","b","c","d","e"};      
	         Integer b[]={1,2,3,4,5};
	         GmethodDemo.print(a);                
	         GmethodDemo.print(b);
	         
	         System.out.println( GmethodDemo.print(a).length );
	         System.out.println( GmethodDemo.print(b).length );
	      }                             
	
}
