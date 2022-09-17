public class TestCurrency {
	static Customer show;
	static {
		show = new Customer();
	}

	public static void main(String[] args) {
		
		show.cash();		
	}	
} 

class Customer {

	 void cash() {
	 	Bank b = new Deposit();
	 	b.chashing();
	 	b = new Saving();
	 	b.chashing(); 
	}
}

abstract class Bank {

	abstract void chashing();
}

class Deposit extends Bank {
	@Override
	void chashing() {
		System.out.println("Cash from deposit!!!");
	}
}

class Saving extends Bank {
	@Override
	void chashing() {
		System.out.println("Cash from Saving!!!");
	}

}