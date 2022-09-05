/* cons([5, 1, 4, 3, 2]) ➞ true
// Can be re-arranged to form [1, 2, 3, 4, 5]

cons([5, 1, 4, 3, 2, 8]) ➞ false

cons([5, 6, 7, 8, 9, 9]) ➞ false
// 9 appears twice

*/

public class ConsectiveNumbers {

	public static boolean showNumbers(int [] array) {

		boolean sensor = true;

		array = sortingAscend(array);

		for(int i = 0 ; i < array.length -1 ; i ++) {

			if(array[i+1] - array[i] != 1) {
				sensor = false;
				break;
			} 
		}

		return sensor;
	}

	public static int[] sortingAscend(int [] array) {

		int temp = 0;
		int sensor = 0;

		for(int i =0; i < array.length; i ++) {

			if(i == array.length -1) {
				i = -1;
				sensor ++;
			} else {

				if(array[i] > array[i + 1]) {
					temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
				}
			}

			if(sensor == array.length -1) {
				return array;
			}
		}
		return array;
	}
}