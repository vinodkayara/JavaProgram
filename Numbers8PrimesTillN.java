package com.practice;

public class Numbers8PrimesTillN {
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
			for(int k=1;k<=10000;k++) {
			int num=k;
			int count = count_fact(num);
			if(count==2) {
					
				System.out.println(num);	
					}
			
			}



}

	

}
