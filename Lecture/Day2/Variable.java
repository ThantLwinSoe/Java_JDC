public class Variable {
	
	static String intValue ="100";
	static int value;
	String name = " Thant Lwin Soe";
	public static void main(String [] args) {
		int intValue = 200;
		System.out.println(intValue);
		
		new Variable().callVariable();
		new Variable().sumValue();
		new Variable().unicodeCall();
	}

	void callVariable() {
	
		System.out.println(intValue);

	}

	void sumValue() {
		System.out.println(value+value);
	}

	void unicodeCall() {
	 	char cod = '\u1000';
		char cod1 = '\u0021';
		System.out.println(cod);
		System.out.println(cod1);
	}
}
