package cn.tju.chp04.s01.generic;

public class GmethodDemo {
	public static <T>  T[]  print(T[] list) {	       
		for (int i = 0; i < list.length; i++) {
			System.out.print(" " + list[i]);
		}
		return list;
	}      
	
	    
	public static void main(String[] args) {
		String a[]={"a","b","c","d","e"};		
		Integer b[]={1,2,3,4,5};
		
		GmethodDemo.print(a);
		System.out.println();
		GmethodDemo.print(b);
		}                             
	
}
