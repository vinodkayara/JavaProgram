package com.practiceRecursion;

public class Recursion1 {
	public static void printNumbers(int current,int N) {
		if(current>N) {
			return;
		}
		
		System.out.println(current+" ");
		printNumbers(current+1,N);
	}
	
	
	
	
	public static void main(String []args) {
		int N=5;
		printNumbers(1,N);
		
	
		
		
	}

}
