package cn.tju.chp04.s02.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("A");
		all.add("B");
		all.add("C");
		System.out.println("由前向后输出：");
		ListIterator<String> iter = all.listIterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.print(str + ",");
		}
		
		System.out.println("\n由后向前输出：");
		while(iter.hasPrevious()) {
			System.out.print(iter.previous()+",");
		}
		
	}

}
