package com.practice;

public class Numbers26FiboNo {

	public static void  Fib_num(int num) {
		int a=0 ,b=1,sum=0;
		
	
		for(int i=1;i<=num;i++) {
			
			System.out.println(a+" ");
			sum=a+b; //8
			a=b;   //5
			b=sum;  //8
			
			
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
        Fib_num(num);
	}

}
