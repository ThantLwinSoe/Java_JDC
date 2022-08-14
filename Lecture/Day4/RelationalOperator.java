public class RelationalOperator {

	public static void main(String [] args) {
		
		
		// Call greaterNumber Method		
		System.out.println("The Greater Number is: " + greaterNumber ( 10 , 20));
		
		
		
		notEqual (4 , 4 );


	}


	static int greaterNumber( int i , int j) {

		if ( i > j ){

			return i;
		} else {
			return j;
		}

	}


	static void notEqual( int i , int j) {

		if ( i == j ) {
			System.out.println("The Numbers are same");
		} else {
			System.out.println("Number One is not equal Number Two");
		}
	}


}

