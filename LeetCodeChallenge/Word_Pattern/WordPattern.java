/* problem of Leetcode.com
   Code by me

   Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
*/


import java.util.*;
public class WordPattern {

	public static boolean wordPattern(String pattern, String s) {

		Map<String,String> map = new HashMap<>();

		var pat_array = pattern.split("");
		var str_array = s.split(" ");

		if(pat_array.length != str_array.length) {
			return false;
		}

		if(s.isEmpty()) {
			return false;
		}

		for(int i = 0; i < pat_array.length ; i++) {
			
			if(i==0){
			
				map.put(pat_array[i] , str_array[i]);
			
			} else if( !map.containsKey(pat_array[i]) ) {

				if ( map.containsValue( str_array[i] ) ) {
					return false;
				}  else {
					map.put(pat_array[i],str_array[i]);
				} 			

			} else if( map.containsKey(pat_array[i]) ) {
				if( !map.get( pat_array[i]).equals(str_array[i]) ) {

					System.out.println(map.get( pat_array[i]));
					System.out.println(str_array[i]);
					return false;
				} 
			}
		}

		return true;
	}
}