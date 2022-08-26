public class PrimeNumberChallenge {

	public int showPrimeNumberVOne(int number) {

		int sensor = 0;

		// Upper index i 
		for(int i = 2; i <= number ; i ++) {				
	
			// Number Two is PrimeNumber
			if(i == 2) {
				sensor++;
			}
			
			// Below index j
			for(int j = 2 ; j < i ; j ++) {

				if(i%j == 0 ) {
					break;								
				}else {

					//  Double check the below index is really reached position that less than one number itself
						if (j == i-1) {
						sensor ++;
					}
				}

			}

		}
		return sensor;
	} 
}