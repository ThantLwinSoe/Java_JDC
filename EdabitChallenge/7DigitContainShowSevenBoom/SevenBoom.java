import java.util.Arrays;



public class SevenBoom {

/*
	Find the 7 digit in the int Array,
	Use char Array to check even one the integer
*/

	// Method 1
	public String findVersionTwo(int [] array) {
		String show = "";

		String convertString = Arrays.toString(array);

		if(convertString.contains("7")){

			show = "Boom!!!";

		} else {
			show = "There is no 7 in the Array.";
		}

		return show;
	}

	// Method 2 to find 7 Digit
	public String findSeven(int [] array) {

			String show = "There is no 7 in the Array";

			// Arrays.toString give String

			String strFrame = Arrays.toString(array);
			
			// To check digit so change to char Array from String
			char [] charFrame = strFrame.toCharArray();

			for (int i = 0; i < charFrame.length ; i ++) {

				if(charFrame[i] == '7'){

					show = "Boom!";
				} 

			}

		return show;
	}



}