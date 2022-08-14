public class TestOR {

	public static void main (String [] args) {
		

		orTruthTable(1,1);
		orTruthTable(0,1);
		orTruthTable(1,0);
		orTruthTable(0,0);

	}

	public static void orTruthTable( int i , int j) {
		
		if ( i == 1 || j == 1 ) {
			
			System.out.println("TRUE");

		} else {

			System.out.println("FALSE");

		}
	}
}
