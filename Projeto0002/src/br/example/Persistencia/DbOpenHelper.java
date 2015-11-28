package br.example.Persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbOpenHelper extends SQLiteOpenHelper {
	
	private static final String BANCO = "bdProj";
	private static final int VERSION = 1;
	
	public DbOpenHelper(Context context) {
		super(context,BANCO,null, VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		 
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		 
	}
	
}
