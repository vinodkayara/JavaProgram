package com.arraypractice;

public class Array8BinarySearch {
	
	public static int BinarySearch(int arr[],int ele) {
		 
	      int l=0;
	      int h=arr.length-1;
	      
	      
	    while(l<=h) {
	    	int mid=(l+h)/2;
	    	  if(arr[mid]==ele) {
	    		  return mid;
	    		  
	    	  }
	    	  else if(ele>arr[mid]){
	    		  l=mid+1;
	    		  
	    	  }
	    	  else  {
	    		  h=mid-1;
	    	  }
	      }
	    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
      int arr[]= {1,2,4,8,10};
      int ele=10;
      
      
      System.out.println(BinarySearch(arr,ele));
     
	}
	}
	


