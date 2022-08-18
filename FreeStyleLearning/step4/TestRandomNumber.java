import java.util.Scanner;
import java.util.Random;

public class TestRandomNumber {
	
	static Scanner sc;
        static{
		sc = new Scanner (System.in);
	}

	public static void main(String [] args) {
		
		Random random = new Random ();
		System.out.print("Enter number of digit that you want to guess: ");
		int digitNumber = sc.nextInt();

		int i = random.nextInt(digitNumber);
		System.out.println(i);
		
		i = random.nextInt(digitNumber);
		System.out.println(i);
		i = random.nextInt(digitNumber);
		System.out.println(i);
	}
}
