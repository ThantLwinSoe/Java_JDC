/* 	Roman To Integer Challenge idea from Leetcode.com BTW Code by me :3
	

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000 

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 

Constraints:

    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].


*/




public class RomanToInteger {

	static String [] romanArray = {"I","V","X","L","C","D","M"};

	static int [] numberArray = {1,5,10,50,100,500,1000};	

	public static int romanToInteger(String str) {


	int sensor = 0;
	if (str.length() <= 15 && str.length() >= 1) {

		

		

		// first Check the input string that match roman words or not?
		char [] check = str.toCharArray();
		String roman = Arrays.toString(romanArray);

		for(int i = 0; i < check.length ; i ++) {
			Character changeCheck = Character.valueOf(check[i]);

			if( !roman.contains(changeCheck.toString()) ){
				System.out.println("Enter Valid Roman");
				return sensor =0;
			} else {
				
				// Correct String
				// Find the value of Roman
				for (int j = 0; j < romanArray.length ; j ++) {

					// Check IV or not?
/*					if(changeCheck.toString().equals("I") ) {

						if(i< check.length -1){
							if (Character.valueOf(check[i + 1]).toString().equals("V")) {

								i++;
								sensor += 4;
							} else if(Character.valueOf(check[i + 1]).toString().equals("X")) {
								i++;
								sensor += 9;
							}
						}
					}
*/					
					if(changeCheck.toString().equals(romanArray[j])) {
						// Check IV,IX or not?
						if(romanArray[j].equals("I") ) {

							if(i< check.length -1){
								if (Character.valueOf(check[i + 1]).toString().equals("V")) {

									i++;
									sensor += 4;
								} else if(Character.valueOf(check[i + 1]).toString().equals("X")) {
									i++;
									sensor += 9;
								} else {
									sensor += numberArray[j];
								}
							} else {
								sensor += numberArray[j];
							}
							// Check XL, XC or not?
						} else if(romanArray[j].equals("X") ) {

							if(i< check.length -1){
								if (Character.valueOf(check[i + 1]).toString().equals("L")) {

									i++;
									sensor += 40;
								} else if(Character.valueOf(check[i + 1]).toString().equals("C")) {
									i++;
									sensor += 90;
								} else {
									sensor += numberArray[j];
								}
							} else {
								sensor += numberArray[j];
							}
							// Check CD,CM or not? 	
						} else if(romanArray[j].equals("C") ) {

							if(i< check.length -1){
								if (Character.valueOf(check[i + 1]).toString().equals("D")) {

									i++;
									sensor += 400;
								} else if(Character.valueOf(check[i + 1]).toString().equals("M")) {
									i++;
									sensor += 900;
								} else {
									sensor += numberArray[j];
								}
							} else {
								sensor += numberArray[j];
							}

						} else {
							sensor += numberArray[j];
						}
					}
					
				}

			}

		} // End the checking process

//		System.out.println("Hello");

	} else {
		System.out.println("Enter at least One Roman Word");
	}
		return sensor;
	}
}