/* Problem From Edabit.com 

Write a function that does the following for the given values: add, subtract, divide and multiply. These are simply referred to as the basic arithmetic operations. The variables have to be defined, but in this challenge they will be defined for you. All you have to do is check the variables, do some string to integer conversions, use some if conditions, and apply the arithmetic operation.
Examples

operation("1",  "2",  "add" ) ➞ 3

operation("4",  "5",  "subtract") ➞ -1

operation("6",  "3",  "divide") ➞ 2

Notes

    The numbers and operation are given as strings and should result in an integer value.
    If the operation results in an ArithmeticException, then return Integer.MIN_VALUE (e.g. division by zero).
    Division results will be rounded down to its integral part.

*/
public class BasicArithmeticGivenString {

	public static int operation(String op1, String op2, String operator) {

		switch (operator) {
			case "sum":
				return sum(op1,op2);
			//	break;
			case "subtract":
				return subtract(op1,op2);
			case "multiply": 
				return multiply(op1,op2);
			case "divide":
				
				try{
					return divide(op1,op2);
				} catch(ArithmeticException e) {
					System.out.println("Operand 2 is Zero!!");
					return Integer.MIN_VALUE;
				}
			default:
				System.out.println("Enter Valid Operator");
				return 0;

		}

	}

	public static int divide(String op1, String op2) {
		return Integer.valueOf(op1) / Integer.valueOf(op2);
	}

	public static int multiply(String op1, String op2) {

		return Integer.valueOf(op1) * Integer.valueOf(op2);
	}

	public static int subtract(String op1, String op2) {

		return Integer.valueOf(op1) - Integer.valueOf(op2);
	}

	public static int sum(String op1, String op2) {

		int i = Integer.valueOf(op1);
		int j = Integer.valueOf(op2);

		return i+j;

	}

}