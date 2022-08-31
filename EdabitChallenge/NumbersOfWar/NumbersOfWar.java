/* warOfNumbers([2, 8, 7, 5]) ➞ 2
// 2 + 8 = 10
// 7 + 5 = 12
// 12 is larger than 10
// So we return 12 - 10 = 2

warOfNumbers([12, 90, 75]) ➞ 27

warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168

*/


public class NumbersOfWar {



	public static int showWhoGroupsGreater(int[] number) {

		int evenNumber = 0;
		int oddNumber = 0;
		for(int i = 0; i< number.length ; i ++) {

			if(number[i]%2 == 0) {
				evenNumber += number[i];
			} else {
				oddNumber += number[i];
			}
		}

		if(evenNumber > oddNumber) {
			return evenNumber-oddNumber;
		} else {
			return oddNumber-evenNumber;
		}


	}
}