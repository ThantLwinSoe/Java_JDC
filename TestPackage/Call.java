package TestPackage;

import TestPackage.com.*;
public class Call {

	public static void main(String[] args) {
		// it does not know the com package 
		TestPackageOne.testOne();
	}
}