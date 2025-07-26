package com.arraypractice;

public class Arrat9BinarrySearchDesc {
	public static int BinaryDescSearch(int arr[],int ele) {
		int h=arr.length-1;
		int l=0;
		
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==ele) {
				return mid;
			}
			
			else if(ele>arr[mid]) { //4>7
			        h=mid-1;
				
			}else {
				  l=mid+1;
				
			}
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,8,7,6,5,4};
		int ele=4;
		
		
		int ind=BinaryDescSearch(arr,ele);
		if(ind==-1) {
			System.out.println("not found");
		}else {
			System.out.println("element fount at index "+ind);
		}
		
		

	}

}
