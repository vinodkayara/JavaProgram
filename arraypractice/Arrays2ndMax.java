package com.arraypractice;

public class Arrays2ndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2000,30,40,80,50,60,70};
		int max1=Integer.MIN_VALUE;
		int min=arr[0];
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
		}
	
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				min=arr[i];
				
			}
		}

		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max1&&arr[i]!=min) {
				if(arr[i]>max2) {
					max2=arr[i];
				}
			
				
			}
			
		}
		System.out.println(max2);
		
		

	}

}
