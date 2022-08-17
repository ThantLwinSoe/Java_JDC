import java.util.Scanner;

public class RelationalOperators {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main (String [] args) {
		
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y = sc.nextInt();

		System.out.printf(" x == y ? %s\n", x == y );
		System.out.printf(" x != y ? %s\n", x != y );
		System.out.printf(" x > y ? %s\n", x > y );
		System.out.printf(" x < y ? %s\n", x <y );
		System.out.printf(" x >= y ? %s\n", x >= y );
		System.out.printf(" x <= y ? %s\n", x <= y );
		System.out.printf(" x == y ? tls : kl ? %s\n", x == y ? "tls" : "kl");

	}

}
