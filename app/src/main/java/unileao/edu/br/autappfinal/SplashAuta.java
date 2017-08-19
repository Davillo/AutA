package unileao.edu.br.autappfinal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashAuta extends AppCompatActivity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_auta);

        long delay = 1500; // tempo de delay em millisegundos
        handler.postDelayed(new Runnable() {
            public void run() {

                // código a ser executado após o tempo de delay
                Intent abreTelaInicial = new Intent(SplashAuta.this,EscolhasActivity.class);
                startActivity(abreTelaInicial);

                finish();

            }
        }, delay);
    }
}
