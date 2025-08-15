package com.stringpractice;

public class String3Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		if(res.equals(s)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}

	}


