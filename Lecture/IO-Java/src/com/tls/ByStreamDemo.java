package com.tls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Byte Stream is for realiable for photos and videos 

public class ByStreamDemo {
	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream(new File("/home/tls/Pictures/ok.jpg"));
				FileOutputStream out = new FileOutputStream(new File("/home/tls/Pictures/ok2.jpg"));			
				
				){ 
			int i = 0 ;
			
			while( (i = in.read()) != -1) {
				out.write(i);
			}
			
			System.out.println("Success!!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
