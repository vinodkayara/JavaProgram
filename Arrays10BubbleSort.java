package com.arraypractice;

import java.util.Arrays;

public class Arrays10BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,5,6,2};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

	}
		System.out.println(Arrays.toString(arr));

}
}