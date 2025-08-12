package com.stringpractice;

import java.util.Arrays;

public class String5toCharArray {
	public static char[] conv_chararray(String s) {
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello";
		char[] res=conv_chararray(s);
		System.out.println(Arrays.toString(res));
		
		

	}

}
