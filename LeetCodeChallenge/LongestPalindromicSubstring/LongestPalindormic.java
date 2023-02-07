class LongestPalindormic {

	public static String getLongestPalindrome(String str) {

		// str = bbb ===> length 3
		var list = new ArrayList<>(List.of(str.split("")));
		var builder = new StringBuilder();

		// for two pointers
		int right = list.size() / 2 ;
		int left = right - 1 ;
		int sensor = 0;

		// only one word
		if(right == 0) {
			return str;
		}

		// index pointers should have two left right 

		do {	
			// left == right ?
			if( list.get(left).equals(list.get(right)) ) {
				
			}

			sensor ++;

		}while( sensor < list.size() -1 );



		return builder.toString();
	}
}