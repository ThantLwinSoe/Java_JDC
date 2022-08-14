public class TestAND {


	public static void main (String [] args) {
		
		andTruthTable( 0 , 1);
		andTruthTable( 0 , 0);
		
		andTruthTable( 1 , 1);
		andTruthTable( 1 , 0);
	}

	static void andTruthTable(int i , int j) {
		
		if ( i == 1 && j == 1 ) {
			System.out.println(" TRUE " );
		} else {
			System.out.println(" FALSE" );
		}


	}
}

