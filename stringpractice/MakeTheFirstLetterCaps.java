package com.stringpractice;

public class MakeTheFirstLetterCaps {
	
	public static String make_Caps(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((i==0&&(ch>=97&&ch<=122))||(i==s.length()-1&&(ch>=97&&ch<=122))){
				char nchar=(char)(s.charAt(i)-32);
				res=res+nchar;
			}
			else {
				res=res+s.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is my country";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(make_Caps(arr[i])+" ");



		}

	}
}