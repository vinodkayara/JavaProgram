package com.practice;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<=n;row++) {
			for( int col=1;col<=n-row;col++) {
				System.out.print(" "+" ");
			}
			
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			for(int col=1;col<=row-1;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int row=n-1;row>=1;row--) {
			for( int col=1;col<=n-row;col++) {
				System.out.print(" "+" ");
			}
			
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			for(int col=1;col<=row-1;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
