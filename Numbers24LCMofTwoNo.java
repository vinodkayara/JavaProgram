package com.practice;

public class Numbers24LCMofTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 5;

		int max = (a > b) ? a : b;
		int lcm = 0;
		for (int i = max; i <= (a * b); i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println(i);
				break;
			}

		}
	}

}
