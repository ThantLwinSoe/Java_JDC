package com.tls;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamDemo {
	
	public static void main(String[] args) {
		
		
		try ( BufferedReader br = new BufferedReader(new FileReader("/home/tls/Desktop/IO Test/firstText.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("/home/tls/Desktop/IO Test/firstText2.txt"));
				){
			
			String str = null ;
			
			while ((str = br.readLine()) != null) {
				bw.write(str);		
			}
			
			System.out.println("Success");
			
		} catch (IOException e) {	
			
		}
	}
}
