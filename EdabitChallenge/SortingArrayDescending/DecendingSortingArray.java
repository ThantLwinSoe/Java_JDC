/* Decending from higher level to Lower level

	 
*/

public class DecendingSortingArray {

	public static void showAscending() {

		int[] array = {1,2,3,4,5,6,7};

		int [] ok = sortAscend(array);

		for (int yes : ok) {

			System.out.println(yes);
		}
		

		

	}

	public static int[] sortDecend(int[] array) {

		int temp;
		int sensor = 0;

		for(int i = 0 ; i < array.length ; i ++ ) {

			if(i == array.length-1) {

				i = -1 ;

		//  why cannot why!!!!! i = 0;		
		//		i = 0;
		//		i = 1;

		// here sensor is work well logically 
		// no problem for sorting but this will take the more time		
				sensor ++;

		//		return array;
		//		System.out.println("i " + i);
		//		System.out.println(sensor);
		//		System.out.println("THis is sensor");
			} else{
			
				if(array[i] < array[i+1]) {

					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				} /*else { // here sensor wrong logiaclly sorting 
					sensor ++;
				} */			
			}

			if (sensor == array.length -1) {

				return array;
			}					

	}	
	return array;

}
}