public class BasicCalculator {

	public void calculator( int op1, char operator, int op2) {
			
//		int result = 0;

			switch (operator){

				case '+':
					System.out.println(op1 + " + " + op2 +" = "+ (op1 + op2));
					break;
				case '-':
					System.out.println(op1 + " + " + op2 +" = "+ (op1 - op2));
					break;
				case '*':
					System.out.println(op1 + " + " + op2 +" = "+ (op1 * op2));
					break;
				case '/':
					System.out.println(op1 + " + " + op2 +" = "+ (op1 / op2));
					break;										
				default:
					System.out.println("Enter correct operator: ");
					break;	


			}

//		return result;
	}
}
