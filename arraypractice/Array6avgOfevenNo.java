package com.arraypractice;

public class Array6avgOfevenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	       int arr[]= {1,2,3,4,5,6,7};
	       float sum=0;
	       float Eavg=0;
	       int count=0;
	       
	       for(int i=0;i<arr.length;i++) {
	    	   if(arr[i]%2==0) {
	    		  sum=sum+arr[i];
	    		  count++;
	    	   }
	    	   
	       }
	      Eavg=sum/count;
	      System.out.println(Eavg);
		

	}

}
