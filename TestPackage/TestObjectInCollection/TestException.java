public class TestException {
	public static void main(String[] args) {

		try{
			lowLvl();
		} catch(MyException e) {
			e.getMessage();
		} catch(RuntimeException e) {
			System.out.println("Exception Handel!!!");
		} catch(Exception e) {
			System.out.println("Exception Handel");
		}
		
		
	}

	public static void highLvl() {

		try{
			lowLvl();
		} catch(Exception e){
			throw new MyException("You Have not account yet!!!");
		}
		
	}

	public static void lowLvl() throws Exception{
		System.out.println("Hello");
	}

}

class MyException extends RuntimeException {

	private String message;

	MyException(String meassge){
		this.message = message;
	}

	public String getMessage(){
		return this.message;
	}
}