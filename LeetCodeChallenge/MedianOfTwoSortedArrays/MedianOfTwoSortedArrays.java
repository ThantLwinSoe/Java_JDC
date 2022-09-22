import java.util.Arrays;
public class MedianOfTwoSortedArrays {

	public static double showMedian(int [] num1, int [] num2) {



		return 0;
	}

	public static int[] sort(int[] num1, int[] num2) {

		int[] array = {};

		int sensor1 = 0;
		int sensor2 = 0;

		for(int i = 0; i < num1.length ; i ++) {
			for(int j = 0; j < num2.length ; j ++) {

				// when same value
				if(num1[i] == num2[j]){
					// insert value of first array
					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num1[i];
					
					// inset value of second array
					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num2[j];

					break;
				} else if(num1[i] > num2[j]) {
					// insert smaller value first
					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num2[j];

					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num1[i];

					break;
				} else {
					// insert smaller value first
					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num1[i];

					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num2[j];

					break;
				}
			}
		}

		return array;
	} 
}