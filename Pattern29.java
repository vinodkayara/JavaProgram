package com.practice;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<=n;row++) {
			int k=row;
			for(int col=1;col<=row;col++) {
				
				System.out.print(k+" ");	
				k++;
				}
			System.out.println();
			
		}

	}

}
