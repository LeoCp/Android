package br.example.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AppOpenHelper extends SQLiteOpenHelper {
	
	
	private static final int VERSION  = 1; // 
	private static String nome = "bdApp"; //

	public AppOpenHelper(Context context) {
		super(context, nome, null, VERSION);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table contato (id integer primary key autoincrement,"
				+"						nome text,"
				+"						telefone text,"
				+"						email text);" );
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table if exists contato");
		onCreate(db);
		
	
		
	}

}
