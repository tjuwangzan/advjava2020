package cn.tju.chp06.s02.annotation;

import java.util.Date;

public class SuppressWarningsTest {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		date.toLocaleString();
	}

}
