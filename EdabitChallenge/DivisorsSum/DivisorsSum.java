public class DivisorsSum {

	public int sumDivisor(int number) {

		int result = 0;

		for(int i = 1; i <= number ; i ++) {

			if(number%i == 0) {
//				System.out.printf("%d divisor is %d \n", number , i);
				result += i;
			}
		}
		return result;
	}
}