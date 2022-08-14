import java.util.Scanner;

public class TestControlStructure {
	
	static Scanner sc;

	static {

		sc = new Scanner(System.in);
	}


	public static void main(String [] args ) {
		
		System.out.print("Please enter the marks: ");
		int i = sc.nextInt();

		examMarks(i);
				
	}

	static void examMarks( int i ) {
		
		if (i<=100 && i>=0) {	
		
		if ( i <= 100 && i >= 80 ) {
			System.out.println("Grade A");
		} else if ( i >= 60  ) {
			System.out.println("Grade B");
		} else if ( i >=40  ){
			System.out.println("Grade C");
		} else {
			System.out.println("Grade D");

		}

		} else {
			System.out.println("Wrong Number!!");
		}


	
	
	}

	static void Hello() {

		System.out.println("Hello Same Folder");
	}




}
	
