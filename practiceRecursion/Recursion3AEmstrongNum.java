package com.recursion;

public class Recursion3AEmstrongNum {
	
	
	public static int count_dig(int num,int count) {
		if(num==0) {
			return count;
			
		}
		
		return count_dig(num/10,count+1);
	}
	
	public static int count_arm(int num,int res,int digit) {
		if(num==0) {
			return res;
		}
		return count_arm(num/10,res+(int)Math.pow(num%10, digit),digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=152;
		int count=0;
		int digit=count_dig(num,count);
		int res=count_arm(num,0,digit);
		
		if(num==res) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		

	}

}
