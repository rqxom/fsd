package com.examples.collections;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> maps=new TreeMap<String, Integer>();
		maps.put("John", 99);
		maps.put("James", 98);
		maps.put("adam", 80);
		maps.put("smith", 78);
		maps.put("John", 78);
		maps.put("joe", null);
		maps.put("tom", null);
//		maps.put(null, null);
//		maps.put(null, null);
//		maps.put(null,40);
		System.out.println(maps);
		
		System.out.println("Mark of James " + maps.get("James"));
		System.out.println("Mark of clara " + maps.get("clara"));
//		System.out.println("Mark of null " + maps.get(null));
		Set<Entry<String,Integer>> entries=maps.entrySet();
		for(Entry<String,Integer> entry:entries) {
			System.out.println("Key " + entry.getKey() + " value " + entry.getValue());
		}
	}

}
