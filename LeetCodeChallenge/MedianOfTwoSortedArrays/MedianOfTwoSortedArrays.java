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

	public static int[] sort(int[] num1, int[] num2) {

		int[] array = {};

		int sensor = 0;
		int temp = 0;

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

						sensor ++ ;
						break;
					} else if(num1[i] > num2[j]) {
						// insert smaller value first
						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num2[j];

						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num1[i];

						sensor ++;
						break;
					} else {
						// insert smaller value first
						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num1[i];

						array = Arrays.copyOf(array, array.length +1);
						array[array.length - 1] = num2[j];

						sensor ++;
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

							sensor ++ ;
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

							} else { 

								temp = array[array.length -1] ;
								array[array.length -1] = num1[i];

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = temp;

								array = Arrays.copyOf(array, array.length +1);
								array[array.length - 1] = num2[j];

							}

//							sensor ++;
							break;
						}
					}
				}

				//	break;
			}

			// When num2 is already gone but num1 is remaining situration 
			if(i >= num2.length) {

				if(num1[i] >= array[array.length -1]) {
					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = num1[i];
				} else {
					temp = array[array.length - 1];
					array[array.length -1] = num1[i];

					array = Arrays.copyOf(array, array.length +1);
					array[array.length - 1] = temp;
				}
				
			}
		}

		return array;
	} 
}