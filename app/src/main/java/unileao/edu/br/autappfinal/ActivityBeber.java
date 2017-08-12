package unileao.edu.br.autappfinal;

import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Locale;

public class ActivityBeber extends AppCompatActivity {
    private ImageView achocolatado,aguadecoco,cafe,agua,cereal,vitaminadefruta,cha,iogurte,leite,milkshake,
    mingau,refrigerante,sorvete,acai,suco,animacaoBeber;

    private TextToSpeech voz;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beber);
        ativarVoz();
        ativarBarra();

        achocolatado = (ImageView) findViewById(R.id.achocolatado); //
        aguadecoco = (ImageView) findViewById(R.id.aguadecoco); //
        cafe = (ImageView) findViewById(R.id.cafe); //
        agua = (ImageView) findViewById(R.id.agua); //
        cereal = (ImageView) findViewById(R.id.cereal); //
        vitaminadefruta = (ImageView) findViewById(R.id.vitaminadefruta); //
        cha = (ImageView) findViewById(R.id.cha); //
        iogurte = (ImageView) findViewById(R.id.iogurte); //
        leite = (ImageView) findViewById(R.id.leite); //
        milkshake = (ImageView) findViewById(R.id.milkshake); //
        mingau = (ImageView) findViewById(R.id.mingau); //
        refrigerante = (ImageView) findViewById(R.id.refrigerante); //
        sorvete = (ImageView) findViewById(R.id.sorvete); //
        acai = (ImageView) findViewById(R.id.acai); //
        suco = (ImageView) findViewById(R.id.suco); //
        animacaoBeber = (ImageView) findViewById(R.id.animacaoBeber);

        achocolatado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroachocolatado);
                voz.speak("Eu quero beber achocolatado",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        aguadecoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroaguacoco);
                voz.speak("Eu quero beber água de côco!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querocafe);
                voz.speak("Eu quero beber café!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        agua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroagua);
                voz.speak("Eu quero beber água!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        cereal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querocereal);
                voz.speak("Eu quero tomar cereal!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        vitaminadefruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querovitamina);
                voz.speak("Eu quero beber vitamina de fruta!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querocha);
                voz.speak("Eu quero beber chá!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        iogurte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroiogurte);
                voz.speak("Eu quero beber iogurte!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        leite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroleite);
                voz.speak("Eu quero beber leite!",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

        milkshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queromilkshake);
                voz.speak("Eu quero beber milk shake!",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        mingau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queromingau);
                voz.speak("Eu quero tomar mingau!",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        refrigerante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querorefrigerante);
                voz.speak("Eu quero beber refrigerante!",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        sorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querosorvete);
                voz.speak("Eu quero tomar sorvete!",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        acai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroacai);
                voz.speak("Eu quero tomar açaí!",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        suco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querosuco);
                voz.speak("Eu quero beber suco!",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }



    private void ativarBarra(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Eu quero:");     //Titulo para ser exibido na sua Action Bar em frente à seta

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void animar(int id){
        animacaoBeber.setImageResource(id);
        animacaoBeber.setVisibility(View.VISIBLE);
        long delay = 2500; // tempo de delay em millisegundos
        handler.postDelayed(new Runnable() {
            public void run() {

                // código a ser executado após o tempo de delay
                animacaoBeber.setVisibility(View.INVISIBLE);

            }
        }, delay);

    }

    private void ativarVoz(){
        voz = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i == TextToSpeech.SUCCESS){
                    voz.setLanguage(Locale.getDefault());
                }else{
                    Toast.makeText(ActivityBeber.this, "Linguagem não configurada!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
