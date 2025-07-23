package com.practice;

public class Numbers27KrishnamurthyNo {

	public static int kr(int num) {
		int sum=0;
		while(num!=0) {
		int	rem=num%10; //5
		int fact=fact_num(rem); //120
		sum=sum+fact;    //120
		num=num/10;
			
		}
		return sum;
		
	}
	
	public static int fact_num(int num) {
		int fct=1;
		for(int i=1;i<=num;i++) {
			fct=fct*i;
		}
		return fct;
	}

	public static void main(String[] args) {
		int num=145;
		int sum=0;
		sum=kr(num);
			if(num==sum) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
        
	}

}
