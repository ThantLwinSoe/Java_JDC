public class TicTagToe {

	public static void show() {

		for( int i = 0; i < 5 ; i++ ) {
			
			System.out.print("\t");

			for ( int j = 0; j <= 10 ; j++) {
				
				if( (i == 0 || i == 2 || i == 4) ) {
				
					if ( j == 3 || j == 7) {
						
						System.out.print("|");
					} else {
						
					//	System.out.print("-");
						System.out.print(" ");

					}

				} else {
					
					if ( j == 3 || j == 7 ) {

						System.out.print("+");
					} else {
						System.out.print("-");
					}

				}	
			//	System.out.print("-");

			}

			System.out.println();
		}

	}
}