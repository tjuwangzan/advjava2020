package cn.tju.chp02.s06.inheritfinal;

public class BikeFinalPara {
	int cube(final int n){
//		n = n+1;
		return n*n*n;
	}

	public static void main(String[] args) {
		System.out.println(new BikeFinalPara().cube(5));

	}

}
