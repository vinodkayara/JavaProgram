package com.practice;

public class removeduplicate {
	public static void main(String args[]) {
		int arr[]= {1,2,2,3,4,4,5};
		int res[]= new int[arr.length];
		int k=0; //1 2
		
		for(int i=0;i<=arr.length-1;i++) {
			boolean isDuplicate=false;
			
			for(int j=0;j<k;j++) {
			
				if(arr[i]==res[j]) {
					isDuplicate=true;
					break;
				}
			
			}
			if(!isDuplicate) {
				res[k]=arr[i];
				k++;
			}
		}

	for (int i=0;i<k;i++) {
		System.out.println(res[i]+" ");
	}
	}

}
