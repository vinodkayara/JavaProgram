package com.practice;

import java.util.Scanner;

public class Numbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n +" * " + i + " = " + (n * i));
		}

	}

}
