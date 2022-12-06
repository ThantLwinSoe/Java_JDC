class CheckArrayLogic { // 0 1 1 0 0 1 1 0 1 length 9 leap  4

	public static boolean check(int leap, int[] game){

		boolean result = false;
		int sensor = 0;

		for(int i = 0; i < game.length ; i++) {

			System.out.println("Begin"+ i);
			
			if(game[i] == 0){
				
//				sensor = i;

				if(i + leap >= game.length || i + leap == game.length - 1) { // 3 false false
					
					if(i + leap >= game.length) {
						return true;
					}

					if(game[i+leap] != 0){
						result = false;
					}
					
				} else {  
					
					if(game[i + leap] == 0) { 

						i = (i + leap) - 1 ;
					//	System.out.println("yes" + i);
						sensor = i + leap;
						
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