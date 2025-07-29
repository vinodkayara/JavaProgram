package com.arraypractice;

import java.util.Arrays;

public class Array15RotateClockOneTime {

	
		public static int[] rotate_Anti(int arr[]) {
			
			
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i-- ) {
				arr[i+1]=arr[i];
			
			}
			arr[0]=temp;
			
			return arr;
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {10,20,30,40,50,60};
			int res[]=rotate_Anti(arr);
			
			System.out.println(Arrays.toString(res));

		}


	}


