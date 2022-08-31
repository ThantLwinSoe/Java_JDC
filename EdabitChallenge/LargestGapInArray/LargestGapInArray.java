/* largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 26
// After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
// Largest gap between 0 and 26 is 26

largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 11
// After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
// Largest gap between 1 and 14 is 13

largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 12
// After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
// Largest gap between 1 and 14 is 12
*/

import java.util.Arrays;

public class LargestGapInArray {

	public static int showLargest(int [] arrayRandom) {

		int result = 0;
		int [] sensorArray ={};

		// sorting array from lower level to higher 
		int [] array = sortingArray(arrayRandom);

		// input gap-number between Numbers of sensorArray to check the biggest number
		for(int i =0 ; i < array.length ; i++) {

			for(int j =i+1 ; j  < array.length ; j ++ ) {

				result = array[j] - array[i];
				sensorArray = Arrays.copyOf(sensorArray, sensorArray.length + 1);
				// input the gap numbers
				sensorArray[sensorArray.length - 1] = result;
			}
		}

		// Sorting again random gap numbers Ascending 
		int [] showTime = sortingArray(sensorArray);
		// show biggest number of Gap
		return showTime[showTime.length -1];
	}



	public static int [] sortingArray(int [] sensorArray) {

		int soft = 0;
		int temp = 0;

		for(int i = 0; i < sensorArray.length ; i ++) {
			if(i == sensorArray.length -1) {
				i = -1;
				soft ++;
			} else {
				if(sensorArray[i] > sensorArray[i+1]){
					temp = sensorArray[i];
					sensorArray[i] = sensorArray[i+1];
					sensorArray[i+1] = temp;
				}
			}

			if(soft == sensorArray.length -1) {
				return sensorArray;
			}
		}


		return sensorArray;
	}
}