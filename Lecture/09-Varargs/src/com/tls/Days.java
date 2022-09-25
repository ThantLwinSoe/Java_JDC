package com.tls;

enum Ok implements Something{

	SUN("SUNDAY"){
		public void doSomething(){
			System.out.println("Yes Super " + SUN.viewName);
		}
	},MON("MONDAY"),TUE("TUESDAY"),WED("WEDNESDAY"),THU("THURSDAY"),FRI("FRIDAY"){
		public void doSomething(){
			System.out.println("Yes Super " + FRI.viewName);
	}},SAT("SATURDAY");

	private String viewName;

	Ok (String viewName) {
		this.viewName = viewName;
	}

	public void doSomething() {

		System.out.println("Today is " + viewName);
	}

}
