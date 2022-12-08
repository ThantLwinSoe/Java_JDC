class CheckArrayLogic { // 0 1 1 0 0 1 1 0 1 length 9 leap  4 

	public static boolean check(int leap, int[] game){

		boolean result = false;
		int count = 0;

		for(int i = 0; i < game.length ; i++) {

			System.out.println("Begin"+ i);

			if(count == 2) {
				return false;
			}

			if(i == 0) {
				count ++;
			}
			
			if(game[i] == 0){
				if(i + leap >= game.length || i + leap == game.length - 1) { // 3 false false
					
					if(i + leap >= game.length) {
//						System.out.println(i + leap);
						return true;
					}

					if(game[i+leap] != 0){
						result = false;
					}
					
				} 

				if(game[i + leap] == 0) { 

						i = (i + leap) - 1 ;
						System.out.println("yes" + i);
					//	sensor ++;
						
				} else {

					if(i > 0 && game[i-1]==0) {
						i = i -2;
					}

				}
				
			} else {
				if(game[i] == 1) {
					return false;
				}
			}
		}

		return result;
	}
}