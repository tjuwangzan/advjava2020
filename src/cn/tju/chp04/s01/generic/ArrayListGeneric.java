package cn.tju.chp04.s01.generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("String");
		list.add(new Integer(2));
		list.add(new Boolean(false));
		
		String str = (String) list.get(0);
		Integer in = (Integer) list.get(1);
		String b = (String)list.get(2);
	}

}
