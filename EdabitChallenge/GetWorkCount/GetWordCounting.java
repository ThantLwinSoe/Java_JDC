import java.util.Scanner;

public class GetWordCounting {
	
	private Scanner sc;
//	private int count;
//	private String [] getString = {};

	{
		sc = new Scanner(System.in);
	}

	public int getStringArray() {
			
		int count = 0;
		System.out.print("Enter a Senetence: ");
		String sentence = sc.nextLine();

//		String [] getString = sentence.split(" ");

		if ( sentence.equals("")) {
			
			return count;
		} else {

			String [] getString = sentence.split(" ");
			count = getString.length;
		}

		return count;
	}
}

