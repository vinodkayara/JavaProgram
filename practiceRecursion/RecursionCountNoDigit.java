package com.recursion;

public class RecursionCountNoDigit {
	
	
	public static int calc_rec_count(int num,int count) {
		if(num==0) {
			return count;
			
		}
		return calc_rec_count(num/10,count+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int count=0;
		int dig=calc_rec_count(num,count);
		System.out.println(dig);
		
	}

}
