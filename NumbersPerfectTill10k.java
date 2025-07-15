package com.practice;

public class NumbersPerfectTill10k {
	public static int Per(int num) {
		
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			sum=sum+i;
			}
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		for(int k=1;k<=10000;k++) {
			int num=k;
	
		int sum=Per(num);
		
		if(num==sum) {
		System.out.println(num);
			}

	}
	}

}
