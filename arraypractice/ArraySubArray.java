package com.arraypractice;

public class ArraySubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for( int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				
			}
		}
	}

}
