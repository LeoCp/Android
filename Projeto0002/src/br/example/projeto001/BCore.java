package br.example.projeto001;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BCore extends SQLiteOpenHelper{
	private static final String BANCO = "bdProj";
	private static final int VERSAO = 1;
	
	public BCore(Context c) {
		super(c,BANCO,null,VERSAO);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table pessoa(id integer primary key autoincrement,"
				+ "nome text"
				+ "idade text"
				+ "cpf text );");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table if exists pessoa");
		onCreate(db);
	}

	
}
