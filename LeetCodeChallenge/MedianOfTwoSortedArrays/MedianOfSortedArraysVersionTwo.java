/* Problem from LeetCode.com 
	Code By me (This version is so Smarter than Previous version)

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

public class MedianOfSortedArraysVersionTwo {

	public static double showMedian(int[] num1 , int[] num2) {

		double d = 0;
		int sensor = 0;

		// when num1 is empty array
		if(num1.length == 0) {
			// to find middle 
			sensor = num2.length/2;
			// Even 
			if(num2.length%2 == 0) {
				d = (double)(num2[sensor] + num2[sensor-1]) / 2;
			}else { // odd
				d = num2[sensor];
			}
		} else if (num2.length == 0) { // When num2 is empty
			sensor = num1.length/2;
			if(num1.length%2 == 0) {
				d = (double)(num1[sensor] + num1[sensor-1]) / 2;
			}else {
				d = num1[sensor];
			}
		} else {
			int[] result = sort(margeOneArray(num1, num2));
			sensor = result.length/2 ;
			if(result.length% 2 == 0) {
				d = (double) (result[sensor] + result[sensor-1]) / 2 ;
			} else {
				d = result[sensor];
			}
		}

		return d;
	}

	public static int[] sort(int[] num) {
		
		int temp = 0;
		int sensorLoop = 0;

		// Sorting from lower to higher 
		for(int i = 0; i < num.length ; i++){

			if(i == num.length -1) {
				i = -1;
				sensorLoop ++;
			}else if(num[i] > num[i+1]){
				temp = num[i];
				num[i] = num[i+1] ;
				num[i+1] = temp; 
			}

			if(sensorLoop == num.length-1) {
				return num;
			}
		
		}

		return num;
	}

	public static int[] margeOneArray(int[] num1, int[] num2) {

		// Creat Totally one Array
		for(int i = 0; i < num2.length ; i ++) {
			num1 = Arrays.copyOf(num1 , num1.length + 1);
			num1[num1.length - 1] = num2[i];
		}		
		
		return num1;
	}
}