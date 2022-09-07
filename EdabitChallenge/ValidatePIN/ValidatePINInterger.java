/*

validate("121317") ➞ true

validate("1234") ➞ true

validate("45135") ➞ false

validate("89abc1") ➞ false

validate("900876") ➞ true

validate(" 4983") ➞ false

*/

public class ValidatePINInteger {

	public static boolean check (String pin) {

		boolean result = false;

		if(pin.length() == 4 || pin.length() == 6) {

			return result = pin.matches("\\d+");

		}

		return result;

	}
}