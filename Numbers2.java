package com.practice;
import java.util.Scanner;

public class Numbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		
		System.out.println("the even numbers are: ");
	
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
			System.out.print(i+" ");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
