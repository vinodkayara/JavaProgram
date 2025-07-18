package com.practice;

public class Numbers20NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		int sum=0;
		
		int square=0;
		
		 square=num*num;
		 
		 while(square>0) {
			int rem=square%10;
			 sum=sum+rem;
			 square=square/10;
			 
		 }
		if(sum==num) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		 

	}

}
