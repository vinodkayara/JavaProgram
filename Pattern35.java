package com.practice;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= 6; col++) {
				if (row == 1 && col % 3 == 0 || row == 0 && col % 3 != 0 || 8 - row == col || (row - col) == 2) {
					System.out.print("*" + " ");
				}
					
					else if(row==2&&col==2) {
						System.out.print("R"+ " ");
					}
				
					else if(row==2&&col==3) {
						System.out.print("C"+ " ");
					}
				
					else if(row==2&&col==4) {
						System.out.print("B"+ " ");
					}
				 else {
					System.out.print(" " + " ");

				}
			}
			System.out.println();
		}

		for (int row = n; row >= 0; row--) {
			for (int col = 0; col <= 6; col++) {
				if (row == 1 && col % 3 == 0 || row == 0 && col % 3 != 0 || 8 - row == col || (row - col) == 2) {
					System.out.print("*" + " ");
				} 
				else if(row==2&&col==2) {
					System.out.print("R"+ " ");
				}
			
				else if(row==2&&col==3) {
					System.out.print("C"+ " ");
				}
			
				else if(row==2&&col==4) {
					System.out.print("B"+ " ");
				}
				else {
					System.out.print(" " + " ");

				}
			}
			System.out.println();
		}

	}

}
