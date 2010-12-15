package com.tw.timemachine.service;

import com.tw.timemachine.db.Database;
import com.tw.timemachine.domain.Activity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ActivityService {
    private Database database;

	public ActivityService(Context context){
    	database = new Database(context, 1);
    }
	
	public void createActivity(Activity activity){
		
		SQLiteDatabase db = database.getWritableDatabase();
		ContentValues values  = new ContentValues();
		
		values.put("id",activity.getId());
		values.put("name",activity.getName());
		values.put("description",activity.getDescription());
		values.put("start_date",activity.getStartDate());
		values.put("start_time",activity.getStartTime());
		values.put("end_time",activity.getEndTime());
		values.put("buzz_time",activity.getBuzzTime());
		values.put("day",activity.getDayOfWeek());
		
		db.insertOrThrow(database.name(), null, values);
	}
}
