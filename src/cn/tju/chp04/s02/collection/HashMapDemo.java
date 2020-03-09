package cn.tju.chp04.s02.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new Hashtable<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		Iterator<Map.Entry<String,Integer>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> ele = iter.next();
			System.out.println(ele.getKey() + "=" + ele.getValue());
		}
	}

}
