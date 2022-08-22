

public class CountingLettersInASearch {


	public int countingLetter(String [][] nameArray, String search) {

		int count = 0;

		for(int i = 0; i < nameArray.length ; i ++ ) {

			for (int j = 0; j < nameArray[i].length ; j ++) {

				if (search.equals(nameArray[i][j])) {

					count ++;
				}


			}

		}


		return count;

	}

	private String[][] setLetter() {

		String [][] nameArray = new String [][] {
			{"Thant", "Lwin", "Soe"},
			{"Khine", "Lai", "Mon"},
			{"Soe","Mon"},
			{"Soe Mon"}
		};

		return nameArray;
	}

	public String [][] getNameArray() {

		return new CountingLettersInASearch().setLetter();
	}
}