public class EndingMatches {

	

	public boolean getMatch (String str1 , String str2) {
		
		int sensor = 1;
		boolean result = false;

		char [] charStr1 = str1.toCharArray();
		char [] charStr2 = str2.toCharArray();

		for (int i = 0; i < charStr2.length ; i ++) {
			
		//	int sensor = 1;
		//	boolean result = false;

			if( charStr2[ charStr2.length - sensor ] == charStr1[ charStr1.length - sensor]) {
				
				sensor ++;
				result = true;	
			} else {
				
				if ( i <= ( charStr2.length - 1)) {
					
					result = false;
				}

			
			}

		}

		return result;	
	}

}
