/* Code by me

Given a string s, find the length of the longest
substring
without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 

Constraints:

    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

*/




import java.util.*;


class LongestSubStringWithoutRepeat {

	
	public static int lengthOfSubString(String str){

	 List<String> list = new ArrayList<>();


		int result = 0;
		int sensor = 0;

		var array = str.split("");
		// "sjyzaeahyh"
		for(int i = 0; i < array.length ; i++) {

			if(i == 0) {
				if(str.matches("")){
					result = 0;
				}else{
					list.add(array[i]);
					result = list.size();
				}
			}else {
				if(list.contains(array[i])){

					if(result <= list.size()) {
						result = list.size();
					}					
					list = list.subList(list.indexOf(array[i])+1 , list.size());
					list.add(array[i]);
					
				}else {
					list.add(array[i]);
					sensor = list.size();
				}
			}

		}	// sjyzae eahy size 6 not 4
		return result >= sensor ? result : sensor;
	}
}