public class CommonDataType {

	public static void main(String [] args) {
		
		String studentName = "Clinderon";
		int age = 18;
		double gpa = 3.75;
		boolean isFemale = true;

		System.out.printf("%s is %d years old.%s has a %f gpa.\n", studentName, age , (isFemale ? "She" : "He") , gpa);
	}
}

