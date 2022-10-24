package com.tls;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		File file = new File("/home/tls/Desktop/IO Test/firstText.txt");
		try {
			file.createNewFile();
			System.out.println("File Exites. ::: " + file.exists());
			
			file.mkdirs();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
