package com.practiceNumbers;

public class NumbersDIgitsDivideNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=120;
      int org=n;
  
      int count=0;
      
      while(n>0) {
    	  int digit=n%10;
    	  
    	  if(digit!=0&& org%digit==0) {
    		  count++;
    	  }
    	  n=n/10;
      }
      System.out.println("the digits are "+count);
	}

}
