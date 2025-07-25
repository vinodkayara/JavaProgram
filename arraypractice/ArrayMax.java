package com.arraypractice;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,40,80,50,60,70};
		int max=arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
