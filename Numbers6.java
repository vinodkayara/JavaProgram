package com.practice;

import java.util.Scanner;

public class Numbers6 {
	
	
	public static void fact_of_num(int n ) {
		
	   System.out.println("The factors of n are:");
	   for(int i=1;i<=n;i++) {
		   if(n%i==0) {
			   System.out.print(i+" ");
		   }
	   }
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		Numbers6 l = new Numbers6();
		l.fact_of_num(n);
		
		
		
		

	}

}
