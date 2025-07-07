package com.practice;


//using Third variable.
public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int row=1;row<=n;row++) {
			int k=1;
			for(int col=1;col<=row;col++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		 for(int row=1;row<=n;row++) {
			int k=5;
			for(int col=1;col<=row;col++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		 
		 System.out.println("--------------------------");
		 
		 for(int row=1;row<=n;row++) {
			 int k=n+1-row;
			 for(int col=1;col<=row;col++) {
				 System.out.print(k+" ");
				 k++;
			 }
			 System.out.println();
		 }
	}

}
