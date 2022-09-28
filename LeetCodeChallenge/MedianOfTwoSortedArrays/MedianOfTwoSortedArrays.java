/* problem from LeetCode.com Code By me
	
	Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 

Constraints:

    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -106 <= nums1[i], nums2[i] <= 106


*/
import java.util.Arrays;
public class MedianOfTwoSortedArrays {

	public static double showMedian(int [] num1, int [] num2) {

		int[] result = sort(num1, num2);
		double d = 0;

		int i = result.length /2 ;

		if(result.length % 2 == 0) {
		 d = (double)(result[i] + result[i-1]) / 2 ;
		} else {
			return (double) result[i];
		}

		return d ;
	}

	public static int[] sort(int[] ok1, int[] ok2) {

		int[] array = {};

		int sensor = 0;
		int temp = 0;
		int filter = 0;

		int[] num1 ;
		int[] num2 ;


		// For num1 empty array
		if(ok1.length == 0) {

			return ok2;

			// For num2 empty array
		} else if (ok2.length == 0) {

			return ok1;

		} else {
			// For Long length assign the outter loop
			if(ok1.length >= ok2.length) {
				num1 = ok1;
				num2 = ok2;
			} else {
				num1 = ok2;
				num2 = ok1;
			}

		for(int i = 0; i < num1.length ; i ++) {
			for(int j = i; j < num2.length ; j ++) {

				// For num1 = {1,2} and num2 = {3,4} situration
				if( j == 0 ) {

					// when same value
					if(num1[i] == num2[j]){
						// insert value of first array
						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num1[i];
						
						// inset value of second array
						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num2[j];

//						sensor ++ ;
						break;
					} else if(num1[i] > num2[j]) {
						// insert smaller value first
						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num2[j];

						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num1[i];

//						sensor ++;
						break;
					} else {
						// insert smaller value first
						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num1[i];

						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num2[j];

//						sensor ++;
						break;
					}

				} else {

					if(j > 0) {
						// when same value
						if(num1[i] == num2[j]){
							// insert value of first array
							array = Arrays.copyOf(array, array.length +1);
							array[array.length - 1] = num1[i];
							
							// inset value of second array
							array = Arrays.copyOf(array, array.length +1);
							array[array.length - 1] = num2[j];

//							sensor ++ ;
							break;
						} else if(num1[i] > num2[j]) { // num1 > num2

							if(num2[j] >= array[array.length - 1]) {

								// insert smaller value first
								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num2[j];

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num1[i];

							} else { 

								temp = array[array.length - 1] ;
								array[array.length - 1] = num2[j] ;

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = temp;

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num1[i];
							}


						//	sensor ++;
							break;
						} else { // num1 < num2 
							// insert smaller value first

							if(num1[i] >= array[array.length -1]){

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num1[i];

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num2[j];

							} else { // i(2) = "3", j(2) = "7" array = {1,2,5,6, +}


								temp = array[array.length -1] ;
								array[array.length -1] = num1[i];

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = temp;

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num2[j];

// 29-9-2022
// 29-9-2022
							}

//							sensor ++;
//							break;
						}
					}
				}

				//	break;
			}

			// When num2 is already gone but num1 is remaining situration 
			if(i >= num2.length) {

		//		for(int k = 1; k < num2.length ; k ++) {

				if(num1[i] >= array[array.length -1]) {
					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num1[i];
				} else {
					temp = array[array.length - 1];
					array[array.length -1] = num1[i];

					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = temp;
				}

			//	}

				
			}
		}

		}

		return array;
	} 
}