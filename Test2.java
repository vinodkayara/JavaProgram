package com.practice;

public class Test2 {
	public static int coun_dig(int num) {
	
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=rem+sum;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=199;
		int k=2;

		int q=(int)Math.pow(10,k-1);
		int end =(int)Math.pow(10,k)-1;
			
		for(int i=q;i<=end;i++) {
			if(coun_dig(i)==s) {
				System.out.println(i);
				break;
			}
		
			
		}
					
		}
		
 

	}


