/* *** 
Recursion Method Testing
*** */
// Look and Learn time!!!
// This code from @LachezarTsK 
// Credit  



public class RecursionDigitCount {

	
	public static int recursionCount(int number) {


		if(number == 0) {

			return 1;
		} 

		int count = 0;

		return recoveryCount(number , count);
	
	}

	public static int recoveryCount(int number, int count){

		if (number == 0) {
			return count;
		}

		return recoveryCount(number / 10 , ++ count);
	}

}