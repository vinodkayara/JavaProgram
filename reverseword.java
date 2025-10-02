package com.practice;

public class reverseword {

	public static void main(String[] args) {
	String s="Hello world";
	
	String []words=s.split(" ");
	StringBuilder res= new StringBuilder();
	
	for(String x:words) {
		StringBuilder rev= new StringBuilder(x);
		res.append(rev.reverse()).append(" ");
		
		
		
	}
	System.out.println(res.toString());
	}

}
