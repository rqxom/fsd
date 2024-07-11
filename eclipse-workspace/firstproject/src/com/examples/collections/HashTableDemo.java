package com.examples.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new Hashtable<String, Integer>();
		map.put("I", 1);
		map.put("II", 2);
		map.put("III", 3);
		
		System.out.println(map);
		System.out.println(map.get("v"));
		Set<String> keys=map.keySet();
		System.out.println(keys);
	}

}
