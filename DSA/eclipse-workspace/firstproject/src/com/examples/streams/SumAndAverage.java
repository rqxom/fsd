package com.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAndAverage {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(-13,12,15,-16,12,-10,8,2,1);
		int sumOfnumbers=numbers.stream().mapToInt(num->num).sum();
		System.out.println(sumOfnumbers);
		
		double avg=numbers.stream().mapToInt(num->num).average().getAsDouble();
		System.out.println("Average " + avg);
		
		int max=numbers.stream().mapToInt(num->num).max().orElse(0);
		System.out.println("Max " + max);
		
		List<Integer> uniqueNumbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNumbers);
		
		int secondSmall=numbers.stream().distinct().sorted().skip(1).findFirst().orElse(0);
		System.out.println(secondSmall);
		
		int secondLarge=numbers.stream().distinct().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst().orElse(0);
		System.out.println("Second largest " + secondLarge);
		
		List<Integer> evenNumbers=numbers.stream().filter((num)->num%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> oddNumbers=numbers.stream().filter((num)->num%2!=0).collect(Collectors.toList());
		System.out.println(oddNumbers);
		
		List<Integer> positiveNumbers=numbers.stream().filter(num-> num>0).collect(Collectors.toList());
		System.out.println(positiveNumbers);
		
		List<Integer> negativeNumbers=numbers.stream().filter(num-> num<0).collect(Collectors.toList());
		System.out.println(negativeNumbers);
		
	
	}

}
