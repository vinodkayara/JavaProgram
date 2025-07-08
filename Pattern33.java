package com.practice;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=1;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				if(k%2==0) {
					
					System.out.print((char)(96+k)+" ");
				}else {
					System.out.print((char)(64+k)+" ");
				}
				k++;
			}
			System.out.println();
		}

	}

}
