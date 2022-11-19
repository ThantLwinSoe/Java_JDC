class IntegerToRoman {

	static SortedMap<Integer,String> sm = new TreeMap<>(Map.of(1,"I",5,"V",10,"X",50,"L",100,"C",500,"D",1000,"M"));
	static SortedMap<Integer,String> cm = new TreeMap<>(Map.of(4,"IV",9,"IX",40,"XL",90,"XC",400,"CD",900,"CM"));
	static int cup = 1;
	static int remainder_digit = 0;
	static int quotient_digit = 0;
	static int number = 0;

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
			
			 remainder_digit = num % divisor; // 145 = 45 
			 quotient_digit = num / divisor;  // 145 = 1   
			 number = quotient_digit * divisor; // 145 = 100

			if(sm.containsKey(number)) {						
					builder.append(sm.get(number));
					cup = remainder_digit;
			} else if(cm.containsKey(number)) {
					builder.append(cm.get(number));
					cup =remainder_digit;
			}

		return builder;  // X
	}
}