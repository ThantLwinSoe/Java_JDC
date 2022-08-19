public class TriangleNumberSequence {

	public int getNumberSequence(int number) {
		
		int result = 0;

		for (int i = 0; i < number ; i ++ ) {
			
			result += (number-i);

		}

		return result;

	}
}
