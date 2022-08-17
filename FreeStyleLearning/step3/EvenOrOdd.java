import java.util.Scanner;

public class EvenOrOdd {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}


	public static void main(String [] args) {
		
		System.out.print("Enter a number: ");

		int num = sc.nextInt();

		System.out.printf("%d is %s Number.\n", num  ,((num%2 == 0) ? "Even" : "ODD" ) );	
	}
}

