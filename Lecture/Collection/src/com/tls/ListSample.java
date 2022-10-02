package com.tls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListSample {
	static String [] DATA = {"Aung", "Maung", "Bo", "Jo"};
	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>(Arrays.asList(DATA));
		
		List<String> linkList = new LinkedList<String>();
		
		linkList.addAll(arrayList);
		
		arrayList.add("OK");
		
		showData(arrayList);
		showData(linkList);
	}
	
	public static void showData( List<String> list) {
		System.out.println(list);
	}

}
