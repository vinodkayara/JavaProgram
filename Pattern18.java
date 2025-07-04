package com.practice;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int n=5;
				for(int row=1;row<=n;row++) {
					for(int col=1;col<=n-row;col++) {
						System.out.print(" "+" ");
					}
					for(int col=n+1-row;col<=n;col++) {
						System.out.print(col+" ");
					}
					for(int col=4;col>=n+1-row;col--) {
						System.out.print(col+" ");
					}
					System.out.println();
				}


	}

}
