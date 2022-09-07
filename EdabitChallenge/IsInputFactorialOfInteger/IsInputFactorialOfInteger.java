/*
	isFactorial(2) ➞ true
// 2 = 2 * 1 = 2!

isFactorial(27) ➞ false

isFactorial(24) ➞ true
// 24 = 4 * 3 * 2 * 1 = 4!

*/
public class IsInputFactorialOfInteger {

	public static boolean showMe(int num) {

		boolean result = false;
//		int sensor = 0;

		int check = 0;

		if(num == 0 || num == 1) {
			return result = true;
		}

		if(num % 2 == 0) {

			for(int i = 0; i <= num ; i++) {

				check = testFactorial(i);

				if (check == num) {
					return result = true;
				} else if (check > num) {
//					System.out.println("index: " + i);
//					System.out.println("check: " + check );
					return result;
				} else {
					// no need body;
				}

			}
		} else {

			return result;
		}
		return result;
	}

/* Factorial series 
		1! = 1
		2! = 2 x 1 = 2
		3! = 3 x 2 x 1 = 6
		4! = 4 x 3 x 2 x 1 = 24		
*/

	public static int testFactorial(int num) {
		int result = 1;
		int i = 0;

		if(num == 0) {
			return result;
		}

		do {
			result *= num -i ; 
			i++;
		} while (i < num);

		return result;
	}
}
