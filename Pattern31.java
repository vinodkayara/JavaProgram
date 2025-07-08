package com.practice;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=1;
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print(k%5+" ");
			  k++;
//				if(k==5) {
//			      k=0;
//				}
//			
		}
			System.out.println();

		}
	}
}
