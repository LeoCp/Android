package br.example.projeto001;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Alterar extends Activity{
		
	int i;
		Spinner spinner;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.alterar);
			
			spinner = (Spinner) findViewById(R.id.spinnerAlterar);
			
			String[] itens = new String[RepositorioPessoa.listaPessoa.size()];
			
			for (i = 0; i < RepositorioPessoa.listaPessoa.size(); i++) {
				
				itens[i] = RepositorioPessoa.listaPessoa.get(i).getNome();
				
			}
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itens);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinner.setAdapter(adapter);
			
			/*more code*/
			
		}
}
