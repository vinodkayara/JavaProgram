package com.arraypractice;

import java.util.Arrays;

public class ArraysAddElementAtSpecIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70};
		int ele=45;
		int index=4;
		int res[]=new int[arr.length+1];
		
		for(int i=0;i<index;i++) {
		            res[i]=arr[i];
		}
		res[index]=ele;
		
		for(int i=index;i<arr.length;i++) {
			 res[i+1]=arr[i];
		}
		
		System.out.println(Arrays.toString(res));
		
		
		
		
}
	}


