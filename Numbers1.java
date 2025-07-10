package com.practice;
import java.util.Scanner;
public class Numbers1 {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n= sc.nextInt();
		
		
		System.out.println("The naturals numbers till n are : ");
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}

}
