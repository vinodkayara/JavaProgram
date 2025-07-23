package com.practice;

public class Numbers23HCFofTwoNo {

			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=12;
		 int min=(a<b)?a:b;
		 int hcf=1;
			for(int i=1;i<=min;i++ ) {
				if(a%i==0&&b%i==0) {
					hcf=i;
				}
					
				}
			System.out.println(hcf)	;	 
	
		 
	}

}
