package cn.tju.chp04.s02.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
//		Collection c = new ArrayList();
//		c.add(new Name("ffff1","l1"));
//		c.add(new Name("f2","l2"));
//		c.add(new Name("fff3","l3"));
		
		Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		
		Iterator i = c.iterator();
		
		while(i.hasNext()){
			String n = (String)i.next();
			System.out.println(n);
		}
		System.out.println("---------------------");
		
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
//		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
//			Name name = (Name) iterator.next();
//			if (name.getFirstName().length() < 3){
//				iterator.remove();
//			}
//			
//		}
//		System.out.println(c);

	}

}
