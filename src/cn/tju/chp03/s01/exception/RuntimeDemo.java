package cn.tju.chp03.s01.exception;

public class RuntimeDemo {

	public static void main(String[] args) {
		int temp = 0;
		try{
			 temp = Integer.parseInt("ab");
		} catch(Exception e){
			e.printStackTrace();
		}
//		temp = Integer.parseInt("100");
		System.out.println(temp + 1);

	}

}
