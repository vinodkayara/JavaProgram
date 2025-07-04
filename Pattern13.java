package com.practice;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n-row;col++) {
				System.out.print(" "+" ");
				}
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
	}

}
