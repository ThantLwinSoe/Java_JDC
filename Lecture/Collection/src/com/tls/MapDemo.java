package com.tls;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	private static String[] data = {"java","React","Angular","Spring"};
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<>();
		
		Map<Integer, String> treeMap = new TreeMap<>();
		
		for(int i = 0 ; i< data.length;i ++) {
			hashMap.put(i, data[i]);
		}
		
		System.out.println(hashMap);
		

	}

}
