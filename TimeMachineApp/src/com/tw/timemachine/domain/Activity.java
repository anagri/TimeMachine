package com.tw.timemachine.domain;




public class Activity {

	private String name ;
	private String description ;
	private DayOfWeek dayOfWeek;
	private String startDate ;
	private String startTime ;
	private String endTime ;
	private String buzzTime ;
	private Integer id;
	
	public Activity(String name, String description, DayOfWeek dayOfWeek,
			String startDate, String startTime, String endTime, String buzzTime) {
		this.name = name;
		this.description = description;
		this.dayOfWeek = dayOfWeek;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.buzzTime = buzzTime;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getDayOfWeek() {
		return dayOfWeek.toString();
	}
	public String getStartDate() {
		return startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public String getBuzzTime() {
		return buzzTime;
	}
	public Integer getId(){
		return id;
	}
	
}
