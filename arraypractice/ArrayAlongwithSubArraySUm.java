package com.arraypractice;

public class ArrayAlongwithSubArraySUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			for (int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
				}
				System.out.println(" : sum "+sum);
			}
			System.out.println();
		}

	}

}
