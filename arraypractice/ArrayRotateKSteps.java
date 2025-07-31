package com.practice;

import java.util.Arrays;

public class ArrayRotateKSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5};
        int n=arr.length;
        int res[]=new int[n];
        int k=3;
        
        for(int i=0;i<n;i++) {
        	res[(i+k)%n]=arr[i];
        }
        System.out.println(Arrays.toString(res));
	}

}
