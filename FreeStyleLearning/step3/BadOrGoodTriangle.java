import java.util.Scanner;

public class BadOrGoodTriangle {

	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}
		
	public static void main(String [] args) {
	
		System.out.print("Enter first angle of Triangle: ");
		int first = sc.nextInt();
		System.out.print("Enter second angle of Triangle: ");
		int second = sc.nextInt();
		System.out.print("Enter third angle of Triangle: ");
		int third = sc.nextInt();

		double result = first + second + third;

		if (result == 180) {
			
			System.out.println("Good Triangle");
		} else {

			System.out.println("Bad Triangle");
		}

	}
}
