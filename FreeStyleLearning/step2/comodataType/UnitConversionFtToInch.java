import java.util.Scanner;

public class UnitConversionFtToInch {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {
		
		String op1;
	//	String op2 = "inches" ;
		double inch ;
		int feet ;

		System.out.println("********* Converter Feet to Inches **********");
		System.out.println("Do you want to Feet or Inches. Choose ft or inches");
		System.out.println("ft or inches");
		
		op1 = sc.nextLine();

		if ( op1.equals("ft") ) {
		
			System.out.print("Enter a value  Feet: ");
			feet = sc.nextInt();
			System.out.printf("%d Feet = %d inches\n", feet , (feet*12));	
		} else if ( op1.equals("inches")) {
			System.out.print("Enter a value inches:  ");
			inch = sc.nextDouble();
			System.out.printf("%f inches = %f feet\n" , inch , (inch/12));
		}else {
			System.out.println("Please enter correct Option");
		}

	}
}
