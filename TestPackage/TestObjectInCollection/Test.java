import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		var a = new A("TLS");
		var b = new B(2022);

		List<Person> list = List.of(a,b);

/*		ArrayList<A> ok = new ArrayList<>();
		ok.add(a);
		System.out.println(ok.get(0).getName());
*/
		ArrayList<Person> test = new ArrayList<>(list);

		test.add(a);
		test.add(b);
		System.out.println(test.get(0).getName());
		//test.get(0).getName()
		System.out.println(test.get(1).getInt());
		


	}
}

class Person {

	String getName(){
		return null;
	}
	int getInt(){
		return 0;
	}

}

class A extends Person{
	String name;
	
	A(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}

class B extends Person {

	int num;

	B(int num) {
		this.num = num;
	}

	public int getInt(){
		return this.num;
	}

}