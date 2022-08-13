public class Test {
	public static void main(String [] args) {
			preIncrement();
			postIncrement();
	}

	public static void preIncrement() {
		int i =10;
		int j =3;
		int k= 0;

		System.out.println(++k);


	}

	public static void postIncrement() {

		int l = 10;

		System.out.println(l++);
	}

}

