package br.example.projeto001;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import br.example.projeto001.Cadastrar;
import br.example.projeto001.R;


public class Cadastrar extends Activity implements OnClickListener{
	
	EditText inpuNome,inpuIdade,inpuCpf;
	Button butCadastrar,butVoltar;
	Pessoa[] pessoa = new Pessoa[100];
	int x = RepositorioPessoa.listaPessoa.size()+1;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laycadastrar);
	
		inpuNome =  (EditText) findViewById(R.id.editTNome);
		inpuIdade =  (EditText) findViewById(R.id.editTIdade);
		inpuCpf =  (EditText) findViewById(R.id.editTCpf);
		butCadastrar = (Button) findViewById(R.id.butCadastrar);
		butCadastrar.setOnClickListener(this);
		butVoltar = (Button) findViewById(R.id.butVoltar);
		butVoltar.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		
		case R.id.butCadastrar :
			
			pessoa[x] = new Pessoa();
			pessoa[x].setNome(String.valueOf(inpuNome.getText().toString()));
			pessoa[x].setIdade(Integer.valueOf(inpuIdade.getText().toString()));
			pessoa[x].setCpf(Integer.valueOf(inpuCpf.getText().toString()));
			RepositorioPessoa.listaPessoa.add(pessoa[x]);
			
			AlertDialog.Builder y = new AlertDialog.Builder(this);
			y.setMessage(String.valueOf(inpuNome.getText().toString()) + " voce foi cadastrado!");
			y.setNeutralButton("Ok", null);
			y.show();
			
			inpuIdade.setText("");
			inpuCpf.setText("");
			inpuNome.setText("");			
		
			break;
		
		case R.id.butVoltar :
			
			Intent intent = new Intent(this, Principal.class);
        	startActivity(intent);
           
			
		break;
			
		default:
			break;
		}
		
	}

}
