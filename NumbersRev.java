package com.practice;

public class NumbersRev {
	
	
	
	public static int Rev(int num) {
		int res=0;
		while(num!=0) {
			int rem=num%10;
			 res=(res*10)+rem;
			num=num/10;
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=456;
		int res= Rev(num);
		
		System.out.println(res);
		
		
		

	}

}
