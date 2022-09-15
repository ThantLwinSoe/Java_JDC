public class TwoSum {

	public static int[] showTwoSum(int [] num , int target) {

		// result Array
		int [] result = {};

		// To Sum Two Numbers 
		for(int i = 0 ; i < num.length-1 ; i ++) {

			for(int j = i + 1 ; j < num.length ; j++) {

							// match target
				if( target == (num[i] + num[j]) ){
					// One index increase From Original Array and assign Original index value
					result = Arrays.copyOf(result , result.length + 1);
					result[result.length - 1] = i;
					// then one more index increase From Original Array and assign Original index value
					result = Arrays.copyOf(result , result.length + 1);
					result[result.length - 1] = j;

				}
			}

			// match target
/*			if( target == (num[i] + num[i+1]) ){
				// One index increase From Original Array and assign Original index value
				result = Arrays.copyOf(result , result.length + 1);
				result[result.length - 1] = i;
				// then one more index increase From Original Array and assign Original index value
				result = Arrays.copyOf(result , result.length + 1);
				result[result.length - 1] = i+1;

			}
*/
		}

		return result;
	}
}