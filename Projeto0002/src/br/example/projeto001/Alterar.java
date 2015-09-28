package br.example.projeto001;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Alterar extends Activity implements OnClickListener{
		
		int i;
		Spinner spinner;
		EditText edNome,edIdade,edCpf;
		Button butAlterar,butVoltarAlt;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.alterar);
			
			
			spinner = (Spinner) findViewById(R.id.spinnerAlterar);
			edNome = (EditText) findViewById(R.id.iptNome);
			edIdade = (EditText) findViewById(R.id.iptIdade);
			edCpf = (EditText) findViewById(R.id.iptCpf);
			
			butAlterar = (Button) findViewById(R.id.butAlterar);
			butAlterar.setOnClickListener(this);
			
			butVoltarAlt = (Button) findViewById(R.id.butVoltarAlterar);
			butVoltarAlt.setOnClickListener(this);
			
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

		@Override
		public void onClick(View v) {
			
			switch (v.getId()) {
			case R.id.butAlterar:
				
			RepositorioPessoa.listaPessoa.get(spinner.getSelectedItemPosition()).setNome(String.valueOf(edNome.getText().toString()));
			RepositorioPessoa.listaPessoa.get(spinner.getSelectedItemPosition()).setIdade(Integer.valueOf(edIdade.getText().toString()));
			RepositorioPessoa.listaPessoa.get(spinner.getSelectedItemPosition()).setCpf(Integer.valueOf(edCpf.getText().toString()));
			
			AlertDialog.Builder y = new AlertDialog.Builder(this);
			y.setMessage("Alterações feitas com sucesso!");
			y.setNeutralButton("Ok", null);
			y.show();
			
			
			break;
			
			case R.id.butVoltarAlterar:
			
			Intent intent = new Intent(this, Principal.class);
			startActivity(intent);
				
			break;

			default:
				break;
			}
			
		}
}
