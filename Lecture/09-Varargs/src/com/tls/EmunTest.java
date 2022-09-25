package com.tls;

public class EmunTest {

	
	
		public static void main(String [] args) {

			// Yes, it is work
			// System.out.println(Days.SUN.getViewName());

			for (Days d : Days.values()) {
				System.out.println(d);
			}

		}
	}
	
	


enum Days {
	SUN("SUNDAY"),MON("MONDAY"),TUE("TUESDAY"),WED("WEDNESDAY"),THU("THURSDAY"),FRI("FRIDAY"),SAT("SATURDAY");

	// instance variable only private modifier in enum
	private String viewName;

	Days(String viewName) {
		this.viewName = viewName;
	}

	public String getViewName() {

		return this.viewName;
	}

	public String toString() {
		return this.viewName;
	}

	void doSomething() {
		// TODO Auto-generated method stub
		
	}
}
