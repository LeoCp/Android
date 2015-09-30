package br.example.projeto001;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Deletar extends Activity implements OnClickListener {
	
	int i;
	Button butDelete,butVoltarDelete;
	Spinner sp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.deletar);
		
		sp = (Spinner) findViewById(R.id.spiDelete);
		
		butDelete  = (Button) findViewById(R.id.butDelete);
		butDelete.setOnClickListener(this);
		
		butVoltarDelete = (Button) findViewById(R.id.butVoltarDele);
		butVoltarDelete.setOnClickListener(this);
		
		String[] itens = new String[RepositorioPessoa.listaPessoa.size()];
		
		for (i = 0; i < RepositorioPessoa.listaPessoa.size(); i++) {
			
			itens[i] = RepositorioPessoa.listaPessoa.get(i).getNome();
			
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, itens);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
		
		
	}
	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		
		case R.id.butDelete:
			
			RepositorioPessoa.listaPessoa.remove(sp.getSelectedItemPosition());
			
			AlertDialog.Builder y = new AlertDialog.Builder(this);
			y.setMessage("A pessoa foi Deletada");
			y.setNeutralButton("Ok", null);
			y.show();
			
			Intent ite = new Intent(this, Deletar.class);
			startActivity(ite);
			
			break;
			
		case R.id.butVoltarDele:
			
			Intent it = new Intent(this, Principal.class);
			startActivity(it);
			
			
			break;

		default:
			break;
		}
		
	}
}
