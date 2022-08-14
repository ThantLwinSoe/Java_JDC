import java.util.Scanner;



public class KuDaMoNoShops {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {
			
		greeting();

		customerCode();

		System.out.println("Thanks You , See Ya");
	}

	static int greeting() {
		
		System.out.println("Welcome to My Shop");
		System.out.println("1. Apple 1000 kyats");

		System.out.println("2. Orange 500 kyats");
		System.out.println("3. Watermelon 3000 kyats");
		return 1;
	}

	static void customerCode() {
		
		System.out.println("What kinds of fruit do you want to buy?\n Please Choose 1 -3 ");

		int number = sc.nextInt();
			
		if (number == 1 ) {
			System.out.println("Apple 1000 kyats");
			number=1000;
		} else if (number==2) {

			System.out.println("Orange 500 kyats");
			number= 500;
		} else {
			System.out.println("Watermelon 3000 kyats");
			number = 3000;
		}

		System.out.print("How many do you want?");

		int number2 = sc.nextInt();

		System.out.println("Your Total: " + number*number2);

	}


}
