package com.stringpractice;

public class Strings9compareTwoStringsusingcharAraray {

	    public static void main(String[] args) {
	        
	        String str1 = "hello";
	        String str2 = "hello";

	     
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

	        boolean areEqual = true;

	       
	        if (arr1.length != arr2.length) {
	            areEqual = false;
	        } else {
	          
	            for (int i = 0; i < arr1.length; i++) {
	                if (arr1[i] != arr2[i]) {
	                    areEqual = false;
	                    break;
	                }
	            }
	        }

	   
	        if (areEqual) {
	            System.out.println("Both character arrays are equal.");
	        } else {
	            System.out.println("Character arrays are NOT equal.");
	        }
	    }
	}


