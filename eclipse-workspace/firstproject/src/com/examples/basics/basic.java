package com.examples.basics;
import java.util.Scanner;

class basic {
    public static int Charity(int N, int M) {
    	if(N<M && M/N>1){

 		   return (int)M/N;

 		} else {
 			return -1;
 		}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        System.out.println(Charity(N,M));
    }
}