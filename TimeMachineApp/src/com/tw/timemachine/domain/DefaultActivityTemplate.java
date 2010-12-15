package com.tw.timemachine.domain;

import java.util.Date;


public class DefaultActivityTemplate {
	
	private String name ;
	private String description ;
	private DayOfWeek dayOfWeek;
	private String startTime ;
	private String endTime ;
	private String buzzTime ;
	
    public Activity createActivity(){
    	return new Activity(name,description,dayOfWeek,
    			            new Date().toString(),
    			            startTime,endTime,buzzTime);
    }
}
