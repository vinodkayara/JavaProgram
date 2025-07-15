package com.practice;

public class Numbers17ArmstrongNo {
	public static int count_Digit(int num) {
		int count=0;

		while(num!=0) {
			num=num/10;
			
			count++;
			
		}
		return count;
	}
	

	
	public static int Arm(int num) {
		int count= count_Digit(num);
		int rem=0;
		int res=0;
		while(num!=0) {
			rem=num%10;
			res=(int)Math.pow(rem,count)+res;
			num=num/10;
			
			
			
			
			
			
		}
		return res;
		
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num=153;
			int count= count_Digit(num);
			int res=Arm(num);
			
			
			if(num==res) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
	
			}

}
