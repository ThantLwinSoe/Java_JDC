import java.util.Scanner;

public class AreaAndPerimeterOfRactangle {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main(String [] args ) {
		
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		System.out.println("Enter the width: ");
		int width = sc.nextInt();

		System.out.printf("Area of Rectangle: %d \n", (length*width));
		System.out.printf("Perimeter of Rectangle: %d\n", 2*(length + width));
	}
}
