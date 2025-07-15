package com.practice;

public class NumbersPerfect {
	
	
	
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
		
	
		int num=28;
		int sum=Per(num);
		
		if(num==sum) {
			System.out.println("Yes");
			}else {
				System.out.println("No");
			}

	}

}

