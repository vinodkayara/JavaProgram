package com.arraypractice;

public class ArrayMaxSUmOfSUbArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {-7,10,-8,9,-3,-2,6,-6};
		int max_sum=arr[0];
		for(int i=0;i<arr.length;i++) {
			for (int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
				
					sum=sum+arr[k];
				}
				if(sum>max_sum) {
					max_sum=sum;
				}
				
			}
			
		}
		System.out.println(max_sum);


	}

}
