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

public class ActivityFazer extends AppCompatActivity {

    ImageView assistirtv,escovarosdentes,estudar, dormir, iraoparquinho,massademodelar,nadar,ouvirmusica,pentearcabelo,
    tocarinstrumento,tomarbanho,utilizarbanheiro,correr,andardebicicleta,usarcomputador,animacaoFazer;


    private TextToSpeech voz;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer);
        ativarBarra();
        ativarVoz();

        assistirtv = (ImageView)  findViewById(R.id.assistirtv);//
        escovarosdentes = (ImageView)  findViewById(R.id.escovardentes);//
        estudar = (ImageView)  findViewById(R.id.estudar);//
        dormir = (ImageView)  findViewById(R.id.dormir); //
        iraoparquinho = (ImageView)  findViewById(R.id.iraoparquinho);//
        massademodelar = (ImageView)  findViewById(R.id.massinhamodelar);//
        nadar = (ImageView)  findViewById(R.id.nadar);//
        ouvirmusica = (ImageView)  findViewById(R.id.ouvirmusica);//
        pentearcabelo = (ImageView)  findViewById(R.id.pentearcabelo);//
        tocarinstrumento = (ImageView)  findViewById(R.id.tocarinstrumento);//
        tomarbanho = (ImageView)  findViewById(R.id.tomarbanho);//
        utilizarbanheiro = (ImageView)  findViewById(R.id.utilizarbanheiro);//
        correr = (ImageView)  findViewById(R.id.correr); //
        andardebicicleta = (ImageView)  findViewById(R.id.andarbicicleta); //
        usarcomputador = (ImageView)  findViewById(R.id.usarcomputador);//
        animacaoFazer = (ImageView)  findViewById(R.id.animacaoFazer);

        assistirtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroassistirtv);
                voz.speak("Eu quero assistir televisão!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        escovarosdentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroescovarosdentes);
                voz.speak("Eu quero escovar os dentes!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        estudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroestudar);
                voz.speak("Eu quero estudar!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        dormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querodormir);
                voz.speak("Eu quero dormir!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        iraoparquinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroiraoparquinho);
                voz.speak("Eu quero ir ao parquinho!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        massademodelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queromassademodelar);
                voz.speak("Eu quero massa de modelar!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        nadar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queronadar);
                voz.speak("Eu quero nadar!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        ouvirmusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroouvirmusica);
                voz.speak("Eu quero ouvir música!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        pentearcabelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queropentearocabelo);
                voz.speak("Eu quero pentear o cabelo!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        tocarinstrumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querotocarinstrumento);
                voz.speak("Eu quero tocar o instrumento!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        tomarbanho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querotomarbanho);
                voz.speak("Eu quero tomar banho!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        utilizarbanheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querousarobanheiro);
                voz.speak("Eu quero usar o banheiro!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        correr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querocorrer);
                voz.speak("Eu quero ir correr!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        andardebicicleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.queroandardebicicleta);
                voz.speak("Eu quero andar de bicicleta!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        usarcomputador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.querousaropc);
                voz.speak("Eu quero usar o computador!", TextToSpeech.QUEUE_FLUSH,null);
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
        animacaoFazer.setImageResource(id);
        animacaoFazer.setVisibility(View.VISIBLE);
        long delay = 2500; // tempo de delay em millisegundos
        handler.postDelayed(new Runnable() {
            public void run() {

                // código a ser executado após o tempo de delay
                animacaoFazer.setVisibility(View.INVISIBLE);

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
                    Toast.makeText(ActivityFazer.this, "Linguagem não configurada!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
