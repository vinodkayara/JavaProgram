package com.arraypractice;

import java.util.HashMap;
import java.util.Map;

public class ArrayFreequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,2,5,5};
		
		HashMap<Integer,Integer> freqMap= new HashMap<>();
		
		for(int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num,0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()) {
			System.out.println(entry.getKey()+"=>" +entry.getValue());
		}

	}

}
