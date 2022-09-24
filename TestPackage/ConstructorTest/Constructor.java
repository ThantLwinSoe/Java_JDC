public class Constructor {



}

class ConstructorChild extends Constructor{

	ConstructorChild() {

	}
	ConstructorChild(String name) {
		super();
		this(); // this() and also super() must be first statement in counstructor
	}
}