package com.arraypractice;

import java.util.Arrays;

public class Arrays16EqualOrNot {
	public static boolean rotate_Anti(int arr[],int arr1[]) {
		
		if(arr.length!=arr1.length) {
			return false;	
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr1[i]) {
			return false;
		}	
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,50,60};
		int arr1[]= {10,20,30,40,50,60};
		System.out.println(rotate_Anti(arr,arr1));

	}


	}

