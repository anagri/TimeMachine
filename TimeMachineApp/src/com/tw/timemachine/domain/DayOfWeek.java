package com.tw.timemachine.domain;

public enum DayOfWeek {

	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday"),
	SUNDAY("Sunday"),
	WEEKENDS("Only Weekends"),
	WEEKDAYS("Only Weekdays"),
	EVERYDAY("Everyday");
	
	private String display;

	private DayOfWeek(String dispaly){
		this.display = display;
	}
	
}
