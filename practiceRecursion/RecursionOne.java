package com.recursion;

public class RecursionOne {
	public static void print_num(int num) {
		if(num==0) {
			System.out.println(num);
			return;
		}
		print_num(num-1);
		System.out.println(num);
	}
	
	public static void main(String args[]) {
		int num=5;
		print_num(num);
		
	}

}
