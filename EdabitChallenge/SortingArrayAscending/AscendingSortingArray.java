/* Ascending from higher level to Lower level

	 
*/

public class AscendingSortingArray {

	public static void showAscending() {

		int[] array = {4,1,2,99,0,100,0};

		int [] ok = sortAscend(array);

		for (int yes : ok) {

			System.out.println(yes);
		}
		

		

	}

	public static int[] sortAscend(int[] array) {

		int temp;
		int sensor = 0;

		for(int i = 0 ; i < array.length ; i ++ ) {

			if(i == array.length-1) {

				i = -1 ;
		// Cannot i = 0; assign	
		
				sensor ++;

			} else{
			
				if(array[i] > array[i+1]) {

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