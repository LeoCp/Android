package br.example.projeto001;


import android.app.Activity;
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
	
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.laycadastrar);
	
		inpuNome =  (EditText) findViewById(R.id.editTNome);
		inpuIdade =  (EditText) findViewById(R.id.editTIdade);
		inpuCpf =  (EditText) findViewById(R.id.editTCpf);
		butCadastrar = (Button) findViewById(R.id.butCadastrar);
		butVoltar = (Button) findViewById(R.id.butVoltar);
		
	}


	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		
		case R.id.butCadastrar :
			
			
		break;
		
		case R.id.butVoltar :
			
		break;
			
		default:
			break;
		}
		
	}

}
