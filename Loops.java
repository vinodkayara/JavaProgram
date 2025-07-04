package com.practice;

public class Loops {
	public static void main (String []args) {
	
		System.out.println("-------FOR LOOP-------");
    //FOR LOOP
	for(int i=0;i<=5;i++) {
		System.out.println("HI");
	}
	
	
	System.out.println("------WHILE LOOP--------");
	
      
	//WHILE LOOP
	int k=1;
	while(k<=5) {
		System.out.println("HELLO");
		k++;
	
	}
	
	
	System.out.println("------DO WHILE LOOP--------");
	
	//DO WHILE
	int x=1;
	do {
		System.out.println("BYE");
		x++;
	}
	while(x<=5);
	
	
	System.out.println("------NESTED LOOP--------");
    for(int i=1;i<=5;i++) {
    	 for(int j=1;j<=5;j++) {
    	
    	System.out.print("*");
    	 }
    	   System.out.println();
    }
 
}
}
