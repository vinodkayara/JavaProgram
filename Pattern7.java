package com.practice;

public class Pattern7 {
	public static void main(String args[]) {
	int n=5;
	for(int row=1;row<=n;row++) {
		for(int col=row; col>=1;col--) {
			System.out.print((char)(col+64)+" ");
			
			}
		System.out.println();
	}
	}
}
