import java.util.Scanner;

public class AreaOfTriangle {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}
	public static void main(String [] args) {
		
		System.out.print("Enter the height of Triangle: ");
		int height = sc.nextInt();
		System.out.print("Enter the base of Triangle: ");
		int base = sc.nextInt();

		System.out.printf("Area of the Triangle: (base*height)/2 == %f\n ", (float) (height*base)/2);
	}
}
