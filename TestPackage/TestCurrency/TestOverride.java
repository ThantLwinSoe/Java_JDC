
public class TestOverride {

	public static void main(String[] args) {
		// Use Version One
	/*	Address a = new Address("No.1" , "Yangon");
		Person p = new Person("KL", a);
		p.info();	*/	

		// use Version Two
		Address a = new Address("No.1" , "Yangon");
		var p = new Person("TLS", a);
		System.out.println("Name: " + p.getName());
		System.out.println("House: " + p.getAddress().getHouse());
		System.out.println("Township: " + p.getAddress().getTownship());
//		p.getAddress().getHouse()

	}
}



class Person {
	Address address;
	String name;

	Person (String name , Address a) {
		this.name = name;
		this.address = a;
	}

	String getName() {
		return this.name;

	}

	Address getAddress() {
		return this.address;
	}

// Version One
	void info() {
		System.out.println("name : " + this.name);
		System.out.println("house : " + address.getHouse());
		System.out.println("township : " + address.getTownship());
	}

//	Person getPerson() {
//		return new Person();
//	}
}

//class Student extends Person {
//	@Override
//	Student getPerson() {
//		return new Student();
//	}
//}

//Test Has a Relation 

class Address {

	 String house;
	 String township;

	 Address(String house, String township) {
	 	this.house = house;
	 	this.township = township;
	 }

	 String getHouse() {
	 	return this.house;
	 }
	 String getTownship() {
	 	return this.township;
	 }
}