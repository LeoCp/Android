package br.example.projeto001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;



public class Cadastros extends Activity implements OnClickListener{
	
	int i;
	ListView listview;
	Button butVoltar;

	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mostrar);
		
		listview = (ListView) findViewById(R.id.llView);
		butVoltar = (Button) findViewById(R.id.butVoltarMostra);
		butVoltar.setOnClickListener(this);
		
		String[] itens = new String[RepositorioPessoa.listaPessoa.size()];
		
		for(i = 0; i < RepositorioPessoa.listaPessoa.size(); i++){
		
			itens[i] = RepositorioPessoa.listaPessoa.get(i).getNome();
			
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
		listview.setAdapter(adapter);
	
		
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(this, Principal.class);
		startActivity(intent);
		
	}
	

}
