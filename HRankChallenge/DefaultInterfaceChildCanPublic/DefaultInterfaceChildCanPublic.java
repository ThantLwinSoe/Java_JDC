import java.util.Scanner;
import java.util.Arrays;

public class DefaultInterfaceChildCanPublic {

	static Scanner sc = new Scanner(System.in);
	public static void test(){
		
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		
		var demo = new ChildLoader();
		
		if(number != 0) {
			System.out.println("This is Sum of Divisor: " + demo.sumDivisor(number));
		} else {
			System.out.println("You must be enter greater than Z E R O!!!");
		}

		System.out.print("Do you want to look Divisor: Type 1");
		int look = sc.nextInt();

		if (look == 1){
			demo.getDivisor();
		}

	}

}

interface DivisorArithemetic {

	int sumDivisor(int number);
}

class ChildLoader implements DivisorArithemetic {

	private int [] array = {};

	public int sumDivisor(int number) {
		int result = 0;

		for(int i = 1; i <= number ; i ++) {

			if(number%i == 0) {
				array = Arrays.copyOf(array , array.length + 1);
				array[array.length - 1] = i;
				result += i ;
			}

		}
		return result;
	}

/*	public void arrayDivisors (int divisor) {

		array = Arrays.copyOf(array , array.length + 1);
		array[array.length - 1] = divisor;


	} */

	public void getDivisor() {
		for(int ok : array) {
			System.out.println(ok);
		}
	}
}