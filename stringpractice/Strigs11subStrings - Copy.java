package com.stringpractice;

public class Strigs11subStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 String s="hello";
                 for(int i=0;i<s.length();i++) {
                	 for(int j=i;j<s.length();j++) {
                		 System.out.println(s.substring(i, j+1));
                	 }
                 }
	
	
	//without using substring method 
	
	 for(int i=0;i<s.length();i++) {
    	 for(int j=i;j<s.length();j++) {
    		 String res="";
    		 for(int k=i;k<=j;k++) {
    			 res=res+s.charAt(k);
    			 
    		 }
    		 System.out.println(res);
    		 
    	 }
    		   
    	 
	 }
	}
}


