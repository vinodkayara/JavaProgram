package com.arraypractice;

import java.util.Arrays;

public class Array11BubbleSortDesc {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			
			int arr[]= {1,3,5,6,2};
			
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
			System.out.println(Arrays.toString(arr));

	}

	}


