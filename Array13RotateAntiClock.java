package com.arraypractice;

import java.util.Arrays;


public class Array13RotateAntiClock {
	public static int[] rotate_Anti(int arr[]) {
		
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		int res[]=rotate_Anti(arr);
		
		System.out.println(Arrays.toString(res));

	}

}
