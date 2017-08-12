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

public class ActivityBrincar extends AppCompatActivity {

    ImageView bola,carrinho,casinha,boneca,desenhar,domino,ioio,lego,pipa,quebracabeca,urso,xadrez,
    boliche,baralho,videogame,animacaoBrincar;

    private TextToSpeech voz;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brincar);
        ativarBarra();
        ativarVoz();

        bola = (ImageView) findViewById(R.id.bola); //
        carrinho = (ImageView) findViewById(R.id.carrinho);//
        casinha = (ImageView) findViewById(R.id.casinha);//
        boneca = (ImageView) findViewById(R.id.boneca);//
        desenhar = (ImageView) findViewById(R.id.desenhar);//
        domino = (ImageView) findViewById(R.id.domino); //
        ioio = (ImageView) findViewById(R.id.ioio); //
        lego = (ImageView) findViewById(R.id.lego); //
        pipa = (ImageView) findViewById(R.id.pipa); //
        quebracabeca = (ImageView) findViewById(R.id.quebracabeca); //
        urso = (ImageView) findViewById(R.id.urso); //
        xadrez = (ImageView) findViewById(R.id.xadrez); //
        boliche = (ImageView) findViewById(R.id.boliche); //
        baralho = (ImageView) findViewById(R.id.baralho); //
        videogame = (ImageView) findViewById(R.id.videogame);
        animacaoBrincar = (ImageView) findViewById(R.id.animacaoBrincar);



        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarbola);
                voz.speak("Eu quero brincar de bola!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        carrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarcarrinho);
                voz.speak("Eu quero brincar de carrinho!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        casinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarcasinha);
                voz.speak("Eu quero brincar de casinha!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        boneca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarboneca);
                voz.speak("Eu quero brincar de boneca!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        desenhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincardesenho);
                voz.speak("Eu quero brincar de desenhar!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        domino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincardomino);
                voz.speak("Eu quero brincar de dominó!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        ioio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarioio);
                voz.speak("Eu quero brincar de iô-iô!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });


        lego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarlego);
                voz.speak("Eu quero brincar de lego!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        pipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarpipa);
                voz.speak("Eu quero brincar de pipa!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        quebracabeca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarquebracabeca);
                voz.speak("Eu quero brincar de quebra-cabeça!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        urso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarurso);
                voz.speak("Eu quero brincar com o urso!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        xadrez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarxadrez);
                voz.speak("Eu quero brincar de xadrez!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        boliche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarboliche);
                voz.speak("Eu quero brincar de boliche!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        baralho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarbaralho);
                voz.speak("Eu quero brincar de baralho!",TextToSpeech.QUEUE_FLUSH, null);
            }
        });


        videogame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animar(R.drawable.brincarvideogame);
                voz.speak("Eu quero brincar de videogame!",TextToSpeech.QUEUE_FLUSH, null);
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
        animacaoBrincar.setImageResource(id);
        animacaoBrincar.setVisibility(View.VISIBLE);
        long delay = 2500; // tempo de delay em millisegundos
        handler.postDelayed(new Runnable() {
            public void run() {

                // código a ser executado após o tempo de delay
                animacaoBrincar.setVisibility(View.INVISIBLE);

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
                    Toast.makeText(ActivityBrincar.this, "Linguagem não configurada!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
