package com.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

	public static void main(String[] args) {
		
		String sentence="This is an example of HashMap. This example is for finding frequency of words";
		String words[]=sentence.split(" ");
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<words.length;i++) {
			
			int frequency=map.getOrDefault(words[i], 0);
			map.put(words[i], frequency+1);
		}
		System.out.println(map);
	}

}
