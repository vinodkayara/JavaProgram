package com.practice;



public class NeonMethod {
	
	public static int Nsum(int num) {
		int Sqr_num=num*num;
		int sum=0;
	
		while(Sqr_num!=0) {
			int rem =Sqr_num%10; //1  //8
			 sum=sum+rem;   //1 //9
			Sqr_num=Sqr_num/10;  //8  //
			
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			int num=9;
		
			
			int sum=Nsum(num);
		
			
			if(num==sum) {
				System.out.println("Neon");
			}else {
				System.out.println(" Not Neon");
				
			}
			

		}

	}


