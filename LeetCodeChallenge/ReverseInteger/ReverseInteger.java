/* Problem from leetcode.com Code by me

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

 

Constraints:

    -231 <= x <= 231 - 1

*/
public class ReverseInteger {

	public static int showReverse(int num) {

	
        // Convert to String
		String str = Integer.toString(num);
		// Build String Builder for reverse
		StringBuilder sb = new StringBuilder(str);
		
		// Check the signed or unsigned
		if(str.contains("-")) {
			// remove signed
			sb.deleteCharAt(0);
			sb.reverse();
			// insert singed when ready
			sb.insert(0, '-');
			// If you want to large String to convert integer use BigInteger
/*			BigInteger bi = new BigInteger(sb.toString());
			return bi.intValue();
*/			// retrun 0 when out of range of Integer
            try{
                return Integer.parseInt(sb.toString());
            }catch(Exception e) {
                return 0;
            }
		} else {
			sb.reverse();
/*			BigInteger bi = new BigInteger(sb.toString());
			return bi.intValue();
*/
            try{
                return Integer.parseInt(sb.toString());
            }catch(Exception e) {
                return 0;
            }
        }

	}

}
