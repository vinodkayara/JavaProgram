package com.stringpractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class stringFirstNonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="swiss";
		Map<Character ,Integer> freq=new LinkedHashMap<>();
		
		for(char ch:str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch,0)+1);
			
		}
		for(Map.Entry<Character,Integer>entry : freq.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("first non repeating character :"+entry.getKey());
				return;
			}
		}
		System.out.println("no non repeating character is found");
		
	}

}
