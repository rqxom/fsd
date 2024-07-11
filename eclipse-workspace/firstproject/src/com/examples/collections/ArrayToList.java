package com.examples.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		
		int[] numbers= {10,40,22,46,3,6,88,5,43};
		
		List<Integer> numbersList=List.of(10,40,22,46,3,6,88,5,43);
		numbersList.add(24);
		
		List<Integer> arraysAsList=Arrays.asList(10,40,22,46,3,6,88,5,43);
		arraysAsList.add(24);

}
}
