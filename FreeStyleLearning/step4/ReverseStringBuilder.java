import java.util.Scanner;


public class ReverseStringBuilder {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		StringBuilder sb = new StringBuilder(name);
		
		System.out.println("Forward: " + sb.toString());
		System.out.println("Reverse: " + sb.reverse().toString());

	}
}
