package com.practice;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");				
			}
			System.out.println();
		}

	}

}
