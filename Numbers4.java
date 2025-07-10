package com.practice;

import java.util.Scanner;

public class Numbers4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		
		System.out.println("Enter the factors of n are:");
	
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}


	}

}
