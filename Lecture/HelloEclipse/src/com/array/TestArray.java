package com.array;
import java.util.Scanner;

public class TestArray {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		insertArray();
//		showArray();

//		System.out.println(additionArray());
		
//		showArray(insertArray());
//		showArray(insertReverseArray());
		
//		System.out.println(	additionArray(insertArray()) );
//		showArray(insertReverseArray());
	
	//	insertTwoDimentionArrray();
		showTwoDimentionArray(insertTwoDimentionArrray());
		
		
		
	}
	
	public static void  showTwoDimentionArray(String [][] array) {
		
		for(int i = 0; i < array.length ; i ++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.println(array[i][j]);
			}
		}
	}
	
	public static String[][] insertTwoDimentionArrray() {
		
		String [][] name = new String[3][2];
			
		for (int i =0 ; i < name.length ; i ++) {
			
//			System.out.println("This is row " + name.length);
			
				for (int j = 0; j < name[i].length ; j ++) {
				
					
//					System.out.println("This is coloum " + name[i].length);
					System.out.println(i + " " + j);
					
					
					
					if(j == 0 ) {
						
						System.out.println("Enter the First Name: ");
						String personName = sc.nextLine();
					
						name[i][j] = personName;
					} else {
						
						System.out.println("Enter the Last Name: ");
						String personName = sc.nextLine();
					//	String personName = "Kyaw";
						name[i][j] = personName;
					}   
					
				}
		}
		
		
		return name;
	}
	
	public static int [] insertArray() {
		
		int [] index = new int [10];
		
			for (int i = 0; i < index.length ; i ++) {
			
				index [i] = i+1;
			}
		
		return index;
	}
	
	public static int [] insertReverseArray() {
		
		int [] index = new int [10];
		
		
			for(int i = 0; i < index.length ; i ++) {
				
				index[i] = index.length-i;
				
			}
			
			return index;
	}
	
	public static void showArray(int [] index) {
		
		for (int hello : index) {
			
			System.out.print(hello);
			
		}
		System.out.println();
	}
	
	public static int additionArray(int [] index) {
		
		int result = 0;
		
		for(int i = 0; i < index.length ; i ++) {
				
			result += index[i];
		}
		
		return result;
	}

}
