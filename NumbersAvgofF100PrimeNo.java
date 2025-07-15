package com.practice;

public class NumbersAvgofF100PrimeNo {
	
	public static int count_fact(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
			count++;
			
		}
		
	}
		return count;

	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			float  sum=0;
			int p_count=0;
			for(int k=1;;k++) {
			int num=k;
			int count = count_fact(num);
			if(count==2) {
				sum+=num;
		
				p_count++;
					}
			if(p_count==100) {
				System.out.println(sum/100)	;
				break;
				}
			
			}


	}

}
