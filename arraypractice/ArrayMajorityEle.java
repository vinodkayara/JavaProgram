package com.practice;

public class ArrayMajorityEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,4,5,1,2};
		int n=arr.length;
		int count=0;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			if(count==0) {
			 temp=arr[i];
			 count=1;
			 
				
			}else if(arr[i]==temp) {
				count++;
			}else {
				count--;
			}
		}
		System.out.println("The majority element is "+temp);

	}

}
