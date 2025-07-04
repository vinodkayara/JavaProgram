package com.practice;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n=5;
		for(int row=5;row>=1;row--) {
			for(int col=row;col<=n;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
