package com.practice;

import java.util.Arrays;

public class ArrayisSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,9};
		
		 boolean isSorted =true;
		 
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]>arr[i+1]) {
				
				 isSorted=false;
				 break;
			 }
		 }
		 if(isSorted) {
			 System.out.println("yes");
		 }
		 else {
			 System.out.println("No");
		 }
		 
	}

}
