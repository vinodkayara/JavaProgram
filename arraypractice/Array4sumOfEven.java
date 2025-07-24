package com.arraypractice;

public class Array4sumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5,6,7};
       float sum=0;
    
       
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]%2==0) {
    		  sum=sum+arr[i];
    	
    	   }
    	   
       }
     
      System.out.println(sum);
	}

}
