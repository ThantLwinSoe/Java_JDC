public class RomanToInteger {

	static String [] romanArray = {"I","V","X","L","C","D","M"};

	static int [] numberArray = {1,5,10,50,100,500,1000};	

	public static int romanToInteger(String str) {

		// Check the input string that match roman words or not?
		char [] check = str.toCharArray();
		String roman = Arrays.toString(romanArray);

		for(int i = 0; i < check.length ; i ++) {
			Character changeCheck = Character.valueOf(check[i]);

			if( !roman.contains(changeCheck.toString()) ){
				System.out.println("Enter Valid Roman");
				return 0;
			}

		} // End the checking process

		
		

		return 0;
	}
}