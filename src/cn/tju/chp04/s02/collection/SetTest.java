package cn.tju.chp04.s02.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Book{
	private String title;
	private double price;
	
	public Book(String title, double price) {
		
	}
	
}

public class SetTest {

	public static void main(String[] args) {
		Set<String> all = new TreeSet<String>();
		all.add("Nihao");
		all.add("Hello");
		all.add("Hello");
		
		System.out.println(all);

	}

}
