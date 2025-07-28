package com.practice;

import java.util.Arrays;

public class ArrayMoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,3,0,4,6,0};
		
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
