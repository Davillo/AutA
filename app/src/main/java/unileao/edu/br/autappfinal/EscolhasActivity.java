package unileao.edu.br.autappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EscolhasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolhas);
        ativarBarra();
    }

    public void abrirCategoriaComer(View view) {
        Intent i = new Intent(EscolhasActivity.this, ActivityComer.class);
        startActivity(i);
    }

    private void ativarBarra(){
        getSupportActionBar().setTitle("AutA");     //Titulo para ser exibido na  Action Bar
    }

    public void abrirCategoriaBeber(View view) {
        Intent i = new Intent(EscolhasActivity.this, ActivityBeber.class);
        startActivity(i);
    }

    public void abrirCategoriaBrincar(View view) {
        Intent i = new Intent(EscolhasActivity.this, ActivityBrincar.class);
        startActivity(i);
    }

    public void abrirCategoriaFazer(View view) {
        Intent i = new Intent(EscolhasActivity.this, ActivityFazer.class);
        startActivity(i);
    }
}
