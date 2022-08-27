/* Ascending from higher level to Lower level

	At first,find the lowest number in the array
	check lowest number already or not in the final index of array 
*/

public class AscendingSortingArray {

	public static void showAscending() {

		int[] array = {3,4,5};

		System.out.println(sortAscend(array));
		

		

	}

	public static int sortAscend(int[] array) {

		int temp;
		int sensor = 0;

		for(int i = 0; i < array.length ; i ++ ) {

			if(i == array.length-1) {

				for(int j = 1; j < array.length ; j++) {

					if(array[0] > array[j]) {
						sensor ++;
					} 
				}

// TO insert for loop index j 				
				if(sensor == array.length) {
					return array[0];
				} else {
//					sortAscend(array);
				}

			} else{
			
				if(array[i] < array[i+1]) {

					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}			
			}				

	}

	return array[0];

}
}