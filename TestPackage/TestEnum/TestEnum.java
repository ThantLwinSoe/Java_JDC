public class EnumMain {
	public enum Day {
		MON,TUE,WED,THU,FRI,SAT,SUN;

		public String toString(){
			return ordinal() + 1 + ". " + name();
		}

	}

	public static void main(String [] args){
		Day d = Day.MON;
	//	System.out.println(d);

		System.out.println(d.toString());	
	}
}