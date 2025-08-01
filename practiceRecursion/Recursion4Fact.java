package com.recursion;

public class Recursion4Fact {
	public static int rec_fact(int num,int res) {
		if(num==0){
			return res;
			
		}
		return rec_fact(num-1,(res*num));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=rec_fact(5,1);
		System.out.println(res);
	}

}
