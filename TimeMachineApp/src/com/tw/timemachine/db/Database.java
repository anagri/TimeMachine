package com.tw.timemachine.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper{
	
	private static final String DATABASE_NAME = "times.db" ;

	public Database(Context context, int version) {
		super(context, DATABASE_NAME, null, version);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(Queries.CREATE_ACTIVITY_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	public String name() {
		return DATABASE_NAME;
	}

}
