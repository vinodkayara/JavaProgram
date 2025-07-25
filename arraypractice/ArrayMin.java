package com.arraypractice;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,7,1,4,9};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		
		}
		System.out.println(min);
	}

}
