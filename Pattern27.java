package com.practice;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 1;
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				if (k % 2 == 0) {
					System.out.print(0 + " ");

				} else {
					System.out.print(1 + " ");
				}
				k++;
			}
			System.out.println();
		}
		System.out.println("-----");

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(k % 2 + " ");
				k++;
			}
			System.out.println();

		}

	}

}
