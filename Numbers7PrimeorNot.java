package com.practice;

public class Numbers7PrimeorNot {
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
			int num=5;
			int count = count_fact(num);
			if(count==2) {
					
				System.out.println("its prime");	
					}
			else {
				System.out.println("its  not prime");	
			}



}
}
