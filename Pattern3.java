package com.practice;

public class Pattern3 {


	public static void main(String[] args) {
		
	
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=n;col>=n+1-row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}



