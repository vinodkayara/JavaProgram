package com.practice;

public class Pattern8 {
	public static void main(String args[]) {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=n; col>=n+1-row;col--) {
				System.out.print((char)(col+64)+" ");
				
				}
			System.out.println();
		}
		}

}
