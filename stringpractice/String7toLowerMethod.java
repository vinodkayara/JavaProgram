package com.stringpractice;

public class String7toLowerMethod {
	public static String conv_lower(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>=65&&ch<=90) {
				res=res+((char)(ch+32));
				
			}
			else {
				res=res+(ch);
			}
			}
		return res;
	}

	public static void main(String[] args) {
		String s="PenTagON space";
		String res= conv_lower(s);
		System.out.println(res);
		

	}

}
