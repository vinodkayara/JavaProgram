package com.practice;

public class Numbers22 {
	
	public static int sum(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14;
		int gnum=num+1;
		while(sum(num)*2!=sum(gnum)) {
			gnum++;
		}
		System.out.println(gnum);
		
		}
	
	
	}


