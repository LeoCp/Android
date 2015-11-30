package br.example.projeto001;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class Banco {
	private SQLiteDatabase b;
	
	public Banco(Context c) {
		BCore banco  = new BCore(c);
		b = banco.getWritableDatabase();
	}

	public void insert(Pessoa p){
		ContentValues  v = new ContentValues();
		v.put("nome", p.getNome());
		v.put("idade", p.getIdade());
		v.put("cpf", p.getCpf());
		
		b.insert("pessoa", null, v);	
	}
	
	public void update(Pessoa p){
		ContentValues  v = new ContentValues();
		v.put("nome", p.getNome());
		v.put("idade", p.getIdade());
		v.put("cpf", p.getCpf());
		
		b.update("pessoa", v, "id = "+p.getId(), null);
	}
	
	public List<Pessoa> show(Pessoa p){
		List<Pessoa> list = new ArrayList<Pessoa>();
		Cursor cursor = b.query("contato",new String[]{"id","nome","telefone","email"},null,null,null,null,null);
		cursor.moveToFirst();
		
		while(!cursor.isAfterLast()){
			Pessoa pessoa = new Pessoa();
			pessoa.setId(cursor.getInt(0));
			pessoa.setNome(cursor.getString(1));
			pessoa.setIdade(cursor.getInt(3));
			pessoa.setCpf(cursor.getInt(4));
			cursor.moveToNext();
		}
		
		cursor.close();
		return list;
	}
	
}
