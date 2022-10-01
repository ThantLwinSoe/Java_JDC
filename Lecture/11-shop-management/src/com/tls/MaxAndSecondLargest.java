package com.tls;

import java.util.Arrays;

public class MaxAndSecondLargest {
	
	
	public static void setLargest(int[] array , int largest) {
		
		for(int i = 0; i < array.length ; i ++) {
			array[i] = largest ;
		}
	//	return array;
	}
	
	public static void showLargest(int [] array) {
		
		int sensor = 0;
		int temp1 = 0;
		int temp2 = 0;
		
		for(int i = 0 ; i < array.length ; i ++) {
			
			if(i < array.length -1) {
				
				if(array[i] > array[i +1]) {
					temp1 = array[i];
					sensor = i;
				//	System.out.println(sensor);
				}
				
			}
			
			
			
		}
		
		System.out.println(sensor);
		
		for(int j = 0; j< array.length ; j ++) {
			
		//	System.out.println(j);
			
			if(j != sensor ) {
				
			//	System.out.println(j);
				
				if(j < array.length -1) {
					
					System.out.println(j);
					
					if(array[j] > array[j +1]) {
						temp2 = array[j];
						System.out.println(array[j]);
					//	sensor = i;
					}
					
				}
				
			}
			
		}
		
		//System.out.println(temp1 + " " + temp2);
	}
	
	public static void main(String[] args) {
		
		int[] i = {1,20,300,50};
		showLargest(i);
		//int[] j = i;
		
		//Arrays.sort(j);
		
		//int largest = showLargest(i);
		//int[] result = setLargest(i,largest);
		
		
	}

}
