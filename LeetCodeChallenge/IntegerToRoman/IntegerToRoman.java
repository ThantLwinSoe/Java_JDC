/* Code By me
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.

Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 

Constraints:

    1 <= num <= 3999

*/





class IntegerToRoman {

	static SortedMap<Integer,String> sm = new TreeMap<>(Map.of(1,"I",5,"V",10,"X",50,"L",100,"C",500,"D",1000,"M"));
	static SortedMap<Integer,String> cm = new TreeMap<>(Map.of(4,"IV",9,"IX",40,"XL",90,"XC",400,"CD",900,"CM"));
	
	static int remainder_digit = 0;
	static int quotient_digit = 0;
	static int number = 0;

	static int cup = 0;
	static String cup2 = "";

	public static String intToRoman(int num) {	

		StringBuilder builder = new StringBuilder();


		int digit = String.valueOf(num).length();
		if(digit == 4) {
			builder = operation(num,builder,1000);

		} else if(digit == 3) {
			builder = operation(num,builder,100);

		} else if(digit == 2) {
			builder = operation(num,builder,10);
		}else {
			builder = operation(num,builder,1);
		}

		return builder.toString();
	}

	public static StringBuilder operation(int num, StringBuilder builder,int divisor) {
			
			 int sensor1,sensor2; 
			 do {
				 remainder_digit = num % divisor; // 2600=600
				 quotient_digit = num / divisor;  // 2600=2
				 number = quotient_digit * divisor; // 2=2000 

			 	if(cm.containsKey(number)) {
			 		// for cm
			 		var result = cm.get(number);
			 		builder.append(result);

			 		num = remainder_digit;
			 	}else {
			 		// for sm
			 		sm.forEach( (a,b) -> {
			 			if( number >= a) {
			 				cup = a;
			 				cup2 = b;
			 			}
			 		});

			 		builder.append(cup2);
			 		sensor1 = number - cup; // 700 - 500 = 200
			 		num = sensor1 + remainder_digit; // 200 + 93 = 293
			 	}

			 	sensor2 = String.valueOf(num).length(); 
			 		if(sensor2 == 4){
			 			divisor = 1000;
			 		} else if(sensor2 == 3){
			 			divisor = 100;
			 		} else if(sensor2 == 2){
			 			divisor = 10;
			 		} else {
			 			divisor = 1;
			 		}

			 }while(num != 0);



		return builder;  // X
	}
}