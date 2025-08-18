package com.stringpractice;

public class String12pallinfromeSubstring {
	
	public static String rev_string(String res) {
		String ans="";
	
		for(int i=res.length()-1;i>=0;i--) {
			ans=ans+res.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		String s="malayalam";
		String l_str="";
		int max_len=0;
	
		for(int i=0;i<s.length();i++) {
	    	 for(int j=i;j<s.length();j++) {
	    		 String res="";
	    		 for(int k=i;k<=j;k++) {
	    			 res=res+s.charAt(k);
	    			 
	    		 }
	    		
          
          if(res.equals(rev_string(res))) {
        	 if(res.length()>max_len) {
        		 l_str=res;
        		 max_len=res.length();
        		 
        	 }
          }


	}

		}
		System.out.println(l_str);
		System.out.println(max_len);
	}
}
