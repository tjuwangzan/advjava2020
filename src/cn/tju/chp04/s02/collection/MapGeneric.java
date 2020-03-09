package cn.tju.chp04.s02.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapGeneric {
	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<>();
		
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		
		Set<String> set = m1.keySet();
		for(Iterator<String> iter=set.iterator(); iter.hasNext();) {
			String key = iter.next();
			Integer value = m1.get(key);
			
			System.out.println(key+":"+value);
		}
		
		System.out.println("----------------------");
//		
		Set<Map.Entry<String, Integer>> set2 = m1.entrySet();
		for(Iterator<Map.Entry<String, Integer>> iter = set2.iterator();iter.hasNext();) {
			Map.Entry<String, Integer> entry = iter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
	}

}
