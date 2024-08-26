package com.examples.datastructures;

import java.util.Arrays;

public class GreedyCoinsChangePbm {
	public static int findCoinChange(int coins[],int amount) {
		int coinCount=0;
		for(int i=coins.length-1;i>=0;i--) {
			while(amount>=coins[i]) {
				amount=amount-coins[i];
				System.out.println(coins[i]);
				coinCount++;
			}
		}
		if(amount!=0)
			return -1;
		else
			return coinCount;
	}
	public static void main(String[] args) {
		int coins[]= {5,1,2,25,10,50};
		Arrays.sort(coins);
		int amount=28;
		System.out.println("Number of coins required " + findCoinChange(coins, amount));
	}

}
