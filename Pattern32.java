package com.practice;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=0;
		
		for(int row=1;row<=n;row++) {
		
			k=k+row;
			int temp=k;
		
			for(int col=1;col<=row;col++){
			
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println();
		}

	}

}
