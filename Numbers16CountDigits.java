package com.practice;



public class Numbers16CountDigits {

public static int count_Digit(int num) {
	int count=0;

	while(num!=0) {
		num=num/10;
		
		count++;
		
	}
	return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=345687;
		int count=count_Digit(num);
		
		
		
		
		System.out.println(count);
		}

}
