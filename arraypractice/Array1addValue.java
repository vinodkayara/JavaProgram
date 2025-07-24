package com.arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class Array1addValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the values:");
		for(int i=0;i<n;i++) {
	       arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
