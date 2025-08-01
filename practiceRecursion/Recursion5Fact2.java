package com.recursion;

public class Recursion5Fact2 {
	
	public static int rec_fact2(int num) {
		if(num==1) {
			return 1;
			
		}
		return num*rec_fact2(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=rec_fact2(5);
		System.out.println(res);

	}

}
