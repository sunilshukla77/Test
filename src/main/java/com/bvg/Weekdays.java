package com.bvg;

public enum Weekdays {
	
	MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thur"),FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");
	
	String day;
	
	Weekdays(String value){
		this.day = value;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	
}
