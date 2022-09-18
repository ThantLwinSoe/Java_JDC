package com.java.tls;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		// Try with Resources
		try (Scanner sc = new Scanner(System.in); 
				Person p = new Person()) {

			System.out.println("Enter your name: ");
			String name = sc.nextLine();

			if (name.isBlank()) {
				throw new CustomerException.BlankException(name);
			}

			if (name.isEmpty()) {
				throw new CustomerException.EmptyException(name);
			}

		} catch (CustomerException.BlankException e) {
			System.out.println("Exception Handle for Blank");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
// class which extends or implements AutoCloseable need to close the end process 
class Person implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
	}
	
}
