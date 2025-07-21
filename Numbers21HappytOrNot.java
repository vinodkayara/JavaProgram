package com.practice;


public class Numbers21HappytOrNot {
	public static int sqr_sum_digit(int num) {
		
		int sum=0;
		while(num!=0) {
		int rem=num%10;
		sum=sum+(rem*rem);
		num=num/10;
	}
		return sum;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=18;
		int res=sqr_sum_digit(num);
		while(res!=1&&res!=4) {
			res=sqr_sum_digit(res);
		}
		
		if(res==1) {
			System.out.println("I am Happy");
		}else {
			System.out.println("I am Not Happy");
		}

	}

}
