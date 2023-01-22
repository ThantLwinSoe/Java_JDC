class LongestPalindormic {

	public static String getLongestPalindrome(String str) throws IndexOutOfBoundsException{

		// str = bbb ===> length 3
		var list = new ArrayList<>(List.of(str.split("")));
		var builder = new StringBuilder();

		int remainder = str.length() % 2 ;
		int mid = str.length() / 2 ;
		int mid_right = 0;
		int mid_left = 0;
		int sensor = 0;
		if(mid == 0) {
			return str;
		}

		if( remainder != 0 ) {
			mid_right = ( str.length() / 2 ) + 1;// 2
			mid_left = ( str.length() /2 ) - 1; // 0
		} else {
			mid_right = mid; //1
			mid_left = mid - 1; //0					
		}


		do {	

			if( remainder != 0 ) {

				sensor ++; // 1
				if( list.get(mid).equals( list.get(mid_right)) ){

					builder.append(list.get(mid));
					builder.append(list.get(mid_right)); // bb
					if(mid_right < list.size() -1 ) {
						mid_right ++ ;
					}
					
				} else if( list.get(mid).equals( list.get(mid_left)) ) { // mid == mid_left ?
					builder.append(list.get(mid));
					builder.append(list.get(mid_left));
					if (mid_left > 0) {
						mid_left -- ;
					}
						
				} else if( list.get(mid_left).equals(list.get(mid_right)) ) { // mid_left == mid_right ?
					builder.append(list.get(mid));
					builder.append(list.get(mid_left));
					builder.append(list.get(mid_right));
//					mid_right ++ ;
//					mid_left -- ;
				} 			
			}

		}while( sensor < list.size() );



		return builder.toString();
	}
}