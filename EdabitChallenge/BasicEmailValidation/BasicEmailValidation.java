public class BasicEmailValidation {

	public boolean checkEmailValidate (String email) {

	/* ***	
	*	string must contain "@" character and "." character
	*	must have one character in front of @.
	*	"."" and "@" must have correct place.
	* **** */	 
		boolean result = false;

		if(email.contains("@")){

			String [] stringArray = email.split("@");

			if (stringArray[0].equals("")){

				return result;
			} else {

				if (stringArray.length > 1) {

				String finalPart = stringArray[stringArray.length - 1];

				/*** You must read Regex Documentation 
					 It has not split "." character in sample way
				*****/

				String [] finalArray = finalPart.split("\\W");

				if(finalArray.length > 1) {

					result = true;
				
				}
				}



			} 
		}

		

		return result;


	}
}