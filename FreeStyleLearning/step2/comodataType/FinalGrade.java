import java.util.Scanner;

public class FinalGrade {

	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {
		
		System.out.print("Enter the Exam 1 mark: ");
		double mark1 = sc.nextDouble();
		System.out.print("Enter the Exam 2 mark: ");
		double mark2 = sc.nextDouble(); 
		System.out.print("Enter the Exam 3 mark: ");
		double mark3 = sc.nextDouble();
		double grade = (((mark1 + mark2 + mark3)/450)*100);
		System.out.printf("Your Total Marks: %f\n ", (mark1 + mark2 + mark3));
		System.out.println("Final Exam Grade: " + grade); 

	}
}

