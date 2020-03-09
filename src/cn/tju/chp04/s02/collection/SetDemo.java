package cn.tju.chp04.s02.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
//		Set s = new TreeSet();
		s.add("Hello");
		s.add("World");
		s.add(new Name("f1","f2"));
		s.add(new Integer(100));
		s.add(new Name("f1","f2"));
		s.add("Hello");
		
		System.out.println(s);

	}

}
