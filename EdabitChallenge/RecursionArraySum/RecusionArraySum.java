public class RecusionArraySum {

	public int getSum (int [] array) {

		int result = 0;

		for(int i = 0; i < array.length ; i++) {

			result += array[i];
		}
		return result;
	}
} 