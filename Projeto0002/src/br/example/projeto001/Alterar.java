package br.example.projeto001;


import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Alterar extends Activity{
		
		int i;
		Spinner spinner;
		EditText edNome,edIdade,edCpf;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.alterar);
			
			
			spinner = (Spinner) findViewById(R.id.spinnerAlterar);
			edNome = (EditText) findViewById(R.id.iptNome);
			edIdade = (EditText) findViewById(R.id.iptIdade);
			edCpf = (EditText) findViewById(R.id.iptCpf);
			
			String[] itens = new String[RepositorioPessoa.listaPessoa.size()];
			
			for (i = 0; i < RepositorioPessoa.listaPessoa.size(); i++) {
				
				itens[i] = RepositorioPessoa.listaPessoa.get(i).getNome();
				
			}
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itens);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinner.setAdapter(adapter);
			
			
			/*more code*/
			spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

				@Override
				public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
					
					
					edNome.setText(RepositorioPessoa.listaPessoa.get(spinner.getSelectedItemPosition()).getNome());
					edIdade.setText(String.valueOf(RepositorioPessoa.listaPessoa.get(spinner.getSelectedItemPosition()).getIdade()));
					edCpf.setText(String.valueOf(RepositorioPessoa.listaPessoa.get(spinner.getSelectedItemPosition()).getCpf()));
					
				
				}

				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					
					
				}
		
			});
			
		
		
		
		}
}
