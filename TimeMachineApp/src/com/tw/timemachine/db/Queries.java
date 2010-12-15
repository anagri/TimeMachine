package com.tw.timemachine.db;

public class Queries {
	
	public static final String CREATE_ACTIVITY_TABLE 
	 = "create table Activity " +
	 		"( id integer primary key ," +
	 		"name varchar(10)," +
	 		"description varchar(20)," +
	 		"start_date text," +
	 		"start_time text," +
	 		"end_time text," +
	 		"buzz_time text" +
	 		");";
	

}
