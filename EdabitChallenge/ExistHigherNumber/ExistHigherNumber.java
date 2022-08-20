public class ExistHigherNumber {


	public boolean compareNumber(int [] number, int compareNumber) {

		boolean result = false;

		for (int i = 0; i < number.length ; i ++ ) {

				if (compareNumber <= number[i]) {
					result = true;
					return result;
				} 
		}

		return result;

	}
}