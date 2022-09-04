class AbstractDemo {


}

abstract class Animal {

	Animal() {

	}

	Animal (String name) {
		System.out.println("Hello "+ name);
	}
	abstract void eat();


}

class Fish extends Animal {

	Fish() {
		super();
	}

	Fish(String name){
		super(name);
	}

	// eat() method must be override
	@Override
	void eat() {
		System.out.println("eating plants");
	}
}

class Lion extends Animal {

	// void eat() method must be override
	// because of extends the abstract Animal class has abstract method
	@Override
	void eat() {
		System.out.println("Eating Meal");
	}
}