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

public class ActivityComer extends AppCompatActivity {
    private ImageView jantar,almoco,cafeDaManha,banana,bolo,chocolate,maca,laranja,uva,
    pizza,pudim,sanduiche,bolacha, salada,pao,animacaoComer;

    private TextToSpeech voz;

    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comer);
        ativarVoz();
        ativarBarra();

        //ícones
        cafeDaManha = (ImageView) findViewById(R.id.cafedamanha);
        almoco = (ImageView) findViewById(R.id.almoco);
        jantar = (ImageView) findViewById(R.id.jantar);
        maca = (ImageView) findViewById(R.id.maca);
        banana = (ImageView) findViewById(R.id.banana); //
        laranja = (ImageView) findViewById(R.id.laranja);//
        pao = (ImageView) findViewById(R.id.pao); //
        pizza = (ImageView) findViewById(R.id.pizza); //
        sanduiche = (ImageView) findViewById(R.id.sanduiche); //
        bolacha = (ImageView) findViewById(R.id.bolacha); //
        bolo = (ImageView) findViewById(R.id.bolo); //
        chocolate = (ImageView) findViewById(R.id.chocolate);//
        salada = (ImageView) findViewById(R.id.salada); //
        pudim = (ImageView) findViewById(R.id.pudim); //
        uva = (ImageView) findViewById(R.id.uva); //
        animacaoComer= (ImageView) findViewById(R.id.animacaoComer);//



        jantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //animar
                animar(R.drawable.querojantar);
                // /voz
                voz.speak("Eu quero jantar!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        almoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.queroalmocar);
                // /voz
                voz.speak("Eu quero almoçar!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        cafeDaManha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querocafedamanha);
                // /voz
                voz.speak("Eu quero café da manhã!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        maca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.queromaca);
                // /voz
                voz.speak("Eu quero comer maçã!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querobanana);
                // /voz
                voz.speak("Eu quero comer banana!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        laranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querolaranja);
                // /voz
                voz.speak("Eu quero comer laranja!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        pao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.queropao);
                // /voz
                voz.speak("Eu quero comer pão!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.queropizza);
                // /voz
                voz.speak("Eu quero comer pizza!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        sanduiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querosanduiche);
                // /voz
                voz.speak("Eu quero comer sanduíche!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        bolacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querobolacha);
                // /voz
                voz.speak("Eu quero comer bolacha!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        bolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querobolo);
                // /voz
                voz.speak("Eu quero comer bolo!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querochocolate);
                // /voz
                voz.speak("Eu quero comer chocolate!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        salada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querosalada);
                // /voz
                voz.speak("Eu quero comer salada!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });


        pudim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.queropudim);
                // /voz
                voz.speak("Eu quero comer pudim!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        uva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animar
                animar(R.drawable.querouva);
                // /voz
                voz.speak("Eu quero comer uva!", TextToSpeech.QUEUE_FLUSH,null);
            }
        });


    }

    private void ativarVoz(){
        voz = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i == TextToSpeech.SUCCESS){
                    voz.setLanguage(Locale.getDefault());
                }else{
                    Toast.makeText(ActivityComer.this, "Linguagem não configurada!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    private void animar(int id){
        animacaoComer.setImageResource(id);
        animacaoComer.setVisibility(View.VISIBLE);
        long delay = 2500; // tempo de delay em millisegundos
        handler.postDelayed(new Runnable() {
            public void run() {

                // código a ser executado após o tempo de delay
                animacaoComer.setVisibility(View.INVISIBLE);

            }
        }, delay);

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

}
