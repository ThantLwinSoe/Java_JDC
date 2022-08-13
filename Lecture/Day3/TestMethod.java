public class TestMethod {

	public static void main(String ... args) {
		showInfo();

		System.out.println(getName());

		setName("TLS*KL");
	}

	public static void showInfo(){
		String name = "TLS";
		int age = 20;

		System.out.println("My name is: " + name);
		System.out.println("I'm " + age + " years old.");


	}

	public static String getName() {
		String personName = "KL";

		return personName;
	}

	public static int getAge() {
		int age = 100;
		return age;
	}


	public static void setName(String name){
		System.out.println("Rename: " + name);
		
	}

	public static void setAge(int age) {

		System.out.println("Rewrite Age: " + age);
	}

}
