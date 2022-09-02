/* Only Between Gap Numbers
	
largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
// After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
// Largest gap between 9 and 20 is 11

largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4
// After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
// Largest gap between 7 and 11 is 4

largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2
// After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
// Largest gap between 6 and 8 is 2

*/
import java.util.Arrays;

public class LargestGapBetweenGapNumbers {

	public static int showGap(int [] array) {

		int result = 0;
		int [] gaparray = {};
		int [] arrayAscending = sortingAscending(array);

		for(int i = 0; i < arrayAscending.length -1 ; i ++) {

			result = arrayAscending[i+1] - arrayAscending[i];
			gaparray = Arrays.copyOf(gaparray, gaparray.length + 1);

			gaparray[gaparray.length -1 ] = result;
		}

//		return gaparray;
		gaparray = sortingAscending(gaparray);

//		return resultarray;
		return gaparray[gaparray.length-1];
	}

	public static int [] sortingAscending(int [] array) {

		int temp = 0; 
		int sensor = 0;
		for(int i = 0; i < array.length ; i ++) {

			if(i == array.length -1) {
				i = -1;
				sensor ++;
			} else {
				if(array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1]= temp;
				}
			}

			if(sensor == array.length -1) {

				return array;
			}
			
		}

		return array;

	}
}