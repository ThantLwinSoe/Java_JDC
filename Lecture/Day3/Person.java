public class Person {

	public static void main(String [] args) {

		String name = "Thant Lwin Soe";
		int age = 27;

		String school = "JDC";

		System.out.println("My Name is: " + name);
		System.out.println("I am " + age + " years old.");

		System.out.println(school);
		System.out.println("This is my school: " + school); 
		

		postIncrement();
	}

	public static void postIncrement() {

		int l = 10;

		System.out.println(l++);
	}


}
