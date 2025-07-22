package com.practice;



public class Test2method {
	public static int Calc_sum(int num) {
		int sum=0;
		
		while(num!=0) {
		int rem=num%10;
		 sum=sum+rem;
		num=num/10;
		
		}
		return sum;
	}
	
public static int Count_digit(int num) {
	int sum=0;
	int count=0;
	while(num!=0) {
		int rem=num%10;
		 sum=sum+rem;
		num=num/10;
		count++;
		}
	return count;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int s=9;
			int k=2;
			int sum=Calc_sum(s);
			
			int  num=1;
			while(Calc_sum(num)!=s||Count_digit(num)!=k) {
				num++;
			
			}
			System.out.println(num);
	}

}
