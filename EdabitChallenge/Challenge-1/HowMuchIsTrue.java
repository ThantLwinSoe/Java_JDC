public class HowMuchIsTrue {

	public int countTrue(boolean [] input) {
		
		int count=0;

		if (input.length == 0) {
			
			return 0;
		} else {
			
			for (int i = 0; i < input.length; i++ ) {
				
			  int result = Boolean.compare(true, input[i]);

				if( result == 0) {
					
					count++;
				}		
					
					
			 
			}

		}
		
		return count;
	}
}
