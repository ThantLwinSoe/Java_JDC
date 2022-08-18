import java.util.Scanner;

public class TestMathMethod {
	
	static Scanner sc;

	static {
		sc = new Scanner (System.in);
	}

	public static void main(String [] args) {
	
		System.out.print("Enter a circle radius: ");
		int r = sc.nextInt();
		
		double circ = 2*Math.PI*r;
	        double area = Math.PI * r * r;

		System.out.printf("Circumstance: %f\n", circ);
		System.out.printf("Area: %f\n", area);	

	}
}
