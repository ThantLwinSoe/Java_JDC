package com.tls;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// CharacterStream is for readliable for text

public class CharacterStreamDemo {
	public static void main(String [] args) {
		
		try(FileReader fd = new FileReader(new File("/home/tls/Desktop/IO Test/firstText.txt"));
				
			FileWriter fw =  new FileWriter(new File("/home/tls/Desktop/IO Test/CopyTestFromFirst.txt"));	){
			
			int b;
			
			while((b = fd.read()) != -1) {
				fw.write(b);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
