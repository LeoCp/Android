package br.example.persistencia;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class ContatoDao {
	
	private AppOpenHelper sqlOH;
	
	
	public ContatoDao(Context context) {
		
		sqlOH = new AppOpenHelper(context);
			
	}

	
	private Contato incluir(Contato c){
		
		ContentValues cv = new ContentValues();
		cv.put("id", 0);
		cv.put("nome", c.getNome());
		cv.put("telefone", c.getTelefone());
		cv.put("email", c.getEmail());
		
		long id = sqlOH.getReadableDatabase().insert("contato", null, cv);
		c.setId((int) id );
		
		return c;
		
	}
	
	private Contato alterar(Contato c){
		ContentValues cv = new ContentValues();
		cv.put("id", c.getId());
		cv.put("nome", c.getNome());
		cv.put("telefone", c.getTelefone());
		cv.put("email", c.getEmail());
		
		sqlOH.getWritableDatabase().update("contato", cv , "id = "+c.getId(), null);
		return c;
	}
	
	private void excluir(Contato c){
		sqlOH.getWritableDatabase().delete("contato", "id = "+c.getId(), null);
	}
	
	
	// bugs 
	private List<Contato> consultar(Contato c){
		
		List<Contato> list = new ArrayList();
		Cursor cursor = sqlOH.getWritableDatabase().query("contato",new String[]{"id","nome","telefone","email"},null,null,null,null,null);
		cursor.moveToFirst();
		
		while(!cursor.isAfterLast()){
			Contato contato = new Contato();
			contato.setId(cursor.getInt(0));
			contato.setNome(cursor.getString(1));
			contato.setTelefone(cursor.getString(2));
			contato.setEmail(cursor.getString(3));
			list.add(contato);
			cursor.moveToNext();
		
		}
		cursor.close();
		return list;
		
	}
	
	
	
	
}
