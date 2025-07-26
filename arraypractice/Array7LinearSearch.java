package com.arraypractice;

public class Array7LinearSearch {
	
	public static int Lsearch(int[]arr, int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		
	}
		return-1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,1,4,8};
		 int ele=4;
		int res= Lsearch(arr,ele);
		
		

	}
}


