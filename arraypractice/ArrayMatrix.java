package com.arraypractice;

public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,5,6},{3
			,6,7},{4,7,8}};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
			
		}

	}

}
