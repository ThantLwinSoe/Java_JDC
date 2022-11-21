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