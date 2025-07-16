package com.practice;

public class Numbers19DesNo {
	
	public static int count_Des(int num) {
		
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
		
		
	}
	public static int Des(int num) {
		int count=count_Des(num);
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=(int)Math.pow(rem, count)+res;
			num=num/10;
			count--;
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=135;
		int res=Des(num);
		int count=count_Des(num);
		if(num==res) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
	}

}
