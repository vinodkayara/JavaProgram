package com.practice;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6,7};
		int sum1=0;
		
        for(int i=1;i<=arr.length+1;i++) {
        	sum1=sum1+i; //1  3 6 10 15 21 28
        }
		
		int sum=0;
		
		for(int num:arr) {
			sum=sum+num;
		}
		
		System.out.println("The missing numbeer is "+(sum1-sum));
		

	}

}
