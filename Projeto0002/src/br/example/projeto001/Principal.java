package br.example.projeto001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Principal extends Activity implements OnClickListener {
	
	Button butCadastrar,butCadastros,butAlterar,butDelet;
		
	protected void onCreate (Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		
		butCadastrar = (Button) findViewById(R.id.butCadastrarTela);
        butCadastrar.setOnClickListener(this);

        butCadastros = (Button) findViewById(R.id.butCadastros);
        butCadastros.setOnClickListener(this);

        butAlterar = (Button) findViewById(R.id.butAlterar);
        butAlterar.setOnClickListener(this);
        
        butDelet = (Button) findViewById(R.id.butDeleteTela);
        butDelet.setOnClickListener(this);
        

        
	}
	
	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {

        case R.id.butCadastrarTela:
        	
        	Intent intent = new Intent(this, Cadastrar.class);
        	startActivity(intent);
            break;

        case R.id.butAlterar:
        	
        	Intent i = new Intent(this,Alterar.class);
        	startActivity(i);
        	break;

        case R.id.butCadastros:
        	
        	Intent inte = new Intent(this, Cadastros.class);
            startActivity(inte);
            break;
            
        case R.id.butDeleteTela:
        	
        	Intent x = new Intent(this, Deletar.class);
            startActivity(x);
            
            break;
        
        default:
			break;

        }
		

		
	
	}

}

	

	
	


