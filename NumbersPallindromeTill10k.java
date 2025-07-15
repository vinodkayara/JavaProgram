package com.practice;

public class NumbersPallindromeTill10k {
	
	public static int Rev(int num) {
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
			
			
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int k=0;k<=10000;k++) {
			int num=k;
			int rev=Rev(num);
			if(num==rev) {
				System.out.println(num); 
			}
			
			
		}

	}

}
