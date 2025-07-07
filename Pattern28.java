package com.practice;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int k=2;
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(k % 2 + " ");
				k++;
			}
			System.out.println();

		}

	}

}
