package com.practice;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,6,5,4,3,2,1};
		
		for(int j=0;j<arr.length-1;j++) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
