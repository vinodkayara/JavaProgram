package com.practice;

public class Numbers18ArmsNoTill10k {
	
	
	public static int Arms(int num) {
	     int count=count_num(num);
	     
	     int res=0;
	     int rem =0;
	     while(num!=0) {
	    	 rem=num%10;
	    	 res=(int)Math.pow(rem,count)+res;
	    	 num=num/10;
	    	 
	     }
	     return res;
		
	}
	public static int count_num(int num) {
		
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       for(int k=1;k<=10000;k++) {
    	   int num=k;
    	   int count=count_num(num);
   		int res=Arms(num);
   		if(num==res) {
   			System.out.println(num);
   			
   		}
       }
		

	}

}
