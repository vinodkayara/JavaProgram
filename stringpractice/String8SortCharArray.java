package com.stringpractice;

import java.util.Arrays;

public class String8SortCharArray {
//	public static String conv_lower(String s) {
//		String res="";
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			
//			if(ch>=65&&ch<=90) {
//				res=res+((char)(ch+32));
//				
//			}
//			else {
//				res=res+(ch);
//			}
//			}
//		return res;
//	}
	public static void b_sort(char[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					char tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	


	public static void main(String[] args) {
		String s="PenTagON space";
		char arr[]= s.toCharArray();
		b_sort(arr);
		
		
		

	}


}
