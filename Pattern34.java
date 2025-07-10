package com.practice;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;

		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(row==1||col==1||row==n||col==n||row==col ||col==n+1-row||row==n/2+1||col==n/2+1) {
					System.out.print("*"+ " ");
					}else {
						System.out.print(" "+" ");
						
					}		
				}
			System.out.println();
			}

	}

}
