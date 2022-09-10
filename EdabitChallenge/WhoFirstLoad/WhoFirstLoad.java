/*	 Static Block or Instance Block or Constructor
	 Who Frist Loaded 
	 First Static Block
	 Secound Instance Block
	 Third Constructor
	 But when create different object from same CLass
	 static block have not build again 
*/
public class WhoFirstLoad {

	WhoFirstLoad() {
		System.out.println("This is Constructor");
	}

	{
		System.out.println("This is Instance Block");
	}

	static {
		System.out.println("This is Static Block");
	}

}