package br.example.Persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbOpenHelper extends SQLiteOpenHelper {
	
	private static final String BANCO = "bdProj"; // Nome do banco
	private static final int VERSION = 1; // Versão do banco
	
	public DbOpenHelper(Context context) {
		super(context,BANCO,null, VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table pessoa(id integer primary key autoincrement, nome text,idade text,cpf integer);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		 db.execSQL("drop table if exists pessoa");
		 onCreate(db);
	}
	
}
