import java.util.Scanner;

public class MakeYourName {
       
	// For User Input using Scanner	
	static Scanner sc;

	// Don't forget static keyword for main method
	// it is build scanner object outside of the main method
	static {
		sc = new Scanner(System.in);
	}
	

	public static void main(String [] args ) {
		
	//	Scanner sc = new Scanner(System.in);

		System.out.println("******** Make Your Name On Console *********");
		
		// Enter your first name
		System.out.print("Please enter your first name: ");
			
		String firstName = sc.next();

		// Enter your last name
		System.out.print("Please enter your last Name: ");

		String lastName = sc.next();
		
		// Display your name		
		System.out.println("First Name: " + firstName );
		
		System.out.println("Last Name: " + lastName );

		System.out.println("Hello " + firstName + " " + lastName );

		System.out.println("*********************************************");
	}
}

