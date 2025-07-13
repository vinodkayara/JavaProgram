package com.practice;

public class NumbersPrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		boolean isPrime=true;
		if(num<=1) {
			isPrime=false;
		}
		else {
		
			
			for(int i=1;i<=num;i++) {
				if(num%2==0) {
					isPrime=false;
			}
		}
			
			if(isPrime) {
				System.out.print("true");
			}
			else {
				System.out.print(isPrime);
			}

		}
	}
}
	


