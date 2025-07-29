package com.arraypractice;

import java.util.Arrays;

public class Arrays12ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int res[]=new int[arr.length];
		int j=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			res[j]=arr[i];
			j++;
			
		}
		System.out.println(Arrays.toString(res));
		

	}

}
