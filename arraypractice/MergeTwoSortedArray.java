package com.arraypractice;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,5,7};
		int arr2[]= {2,3,6,8,10,12};
		int res[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				res[k]=arr1[i];
				i++;
				k++;
			}
			else {
				res[k]=arr2[j];
				j++;
				k++;
				
			}
			
		}
		while(i<arr1.length) {
			res[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			res[k]=arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(res));
	}

}
