package br.com.trainning.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tela2 extends AppCompatActivity {

    TextView textViewNome;
    TextView textViewIdade;
    TextView textViewTelefone;
    final String TAG="tela2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String telefone = intent.getStringExtra("telefone");

        textViewNome =(TextView)findViewById(R.id.textViewNome);
        textViewIdade = (TextView)findViewById(R.id.textViewIdade);
        textViewTelefone = (TextView)findViewById(R.id.textViewTelefone);

        textViewNome.setText(nome);
        textViewIdade.setText(idade);
        textViewTelefone.setText(telefone);

        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

}
