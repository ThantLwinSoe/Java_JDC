public class SuffleName {

	public String suffleTheName (String name) {

		String result = "";
		int i = 1;


		String [] div = name.split(" ");

		for ( int j = 0; j < div.length ; j ++){

				
				result += div[div.length - i] + " ";

				i++;

		}

		return result;


	}
}