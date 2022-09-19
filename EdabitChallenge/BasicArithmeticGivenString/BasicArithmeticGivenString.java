public class BasicArithmeticGivenString {

	public static int operation(String op1, String op2, String operator) {
		int result = 0;

		switch (operator) {
			case "sum":
				result = sum(op1,op2);
				break;
			default:
				System.out.println("Enter Valid Operator");
				break;

		}

		return result;

	}

	public static int sum(String op1, String op2) {

		int i = Integer.valueOf(op1);
		int j = Integer.valueOf(op2);

		return i+j;

	}
}