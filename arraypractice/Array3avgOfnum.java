package com.arraypractice;

public class Array3avgOfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {35,56,78,89,34};
		float sum=0;
		float avg=0.0f;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		
		avg=sum/arr.length;
		System.out.println(avg);
		

	}

}
