package cn.tju.chp04.s02.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		
		for (int i = 0; i < 6; i++) {
			l1.add("a" + i);
		}
		
		System.out.println(l1);
		l1.add(3,"a1");
		
		System.out.println(l1);
		l1.add(6,"a200");
		System.out.println(l1);
//		System.out.println(l1.get(2) + " ");
		System.out.println(l1.indexOf("a1"));
		System.out.println(l1.lastIndexOf("a1"));
		l1.remove(1);
		System.out.println(l1);
//		Comparator<String> c = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			}
//		};
//		l1.sort(c);
//		System.out.println(l1);

	}

}
