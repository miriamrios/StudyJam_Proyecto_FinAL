package com.example.mirianrios.talk_me;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    private ImageButton ibAbrirPaginaWeb;
    private ImageButton ibEnviarMail;
    private ImageButton ibAbrirApp;
    private Intent intent;

    private ImageView ivLogo2;


    private ImageView ivMama,ivPapa,ivHijo,ivHija;
    private SoundPool spMama, spPapa, spHija,spHijo;
    private int resMama, resPapa, resHija,resHijo;

    private ImageView ivRojo,ivAmarillo,ivVerde,ivNaranja,ivCafe,ivAzul;
    private SoundPool spRojo, spAmarillo,spVerde,spNaranja, spCafe,spAzul;
    private int resRojo, resAmarillo, resVerde,resNaranja, resCafe, resAzul;

    private ImageView ivA,ivE,ivI,ivO,ivU;
    private SoundPool spA, spE, spI,spO,spU;
    private int resA, resE, resI,resO,resU;

    private ImageView ivUno,ivDos,ivTres,ivCuatro,ivCinco,ivSeis,ivSiete,ivOcho,ivNueve,ivCero;
    private SoundPool spUno, spDos, spTres,spCuatro,spCinco, spSeis, spSiete,spOcho,spNueve, spCero;
    private int resUno, resDos, resTres,resCuatro,resCinco, resSeis, resSiete,resOcho,resNueve, resCero;
    private Animation animacion;

    private ImageView ivPerro,ivGato,ivTortuga,ivConejo;
    private SoundPool spPerro, spGato, spTortuga,spConejo;
    private int resPerro, resGato, resTortuga,resConejo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        createSoundPool();

        ivLogo2 = (ImageView) findViewById(R.id.ivLogo2);

        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.move
        );
        ivLogo2.startAnimation(animacion);

        ibEnviarMail = (ImageButton) findViewById(R.id.ibEnviarEmail);
        ibAbrirApp = (ImageButton) findViewById(R.id.ibFacebook);
        ibAbrirPaginaWeb = (ImageButton) findViewById(R.id.ibGithub);

        ibEnviarMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarMail();
            }
        });
        ibAbrirApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirApp();
            }
        });
        ibAbrirPaginaWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPaginaWeb();
            }
        });

        ivMama = (ImageView) findViewById(R.id.ivMama);
        ivPapa = (ImageView) findViewById(R.id.ivPapa);
        ivHijo = (ImageView) findViewById(R.id.ivHijo);
        ivHija = (ImageView) findViewById(R.id.ivHija);

        ivRojo = (ImageView) findViewById(R.id.ivcolorRojo);
        ivAmarillo = (ImageView) findViewById(R.id.ivcolorAmar);
        ivVerde = (ImageView) findViewById(R.id.ivcolorVerde);
        ivNaranja = (ImageView) findViewById(R.id.ivcolorNaranja);
        ivAzul = (ImageView) findViewById(R.id.ivcolorAzul);
        ivCafe = (ImageView) findViewById(R.id.ivcolorCafe);

        ivA= (ImageView) findViewById(R.id.ivVocal_a);
        ivE = (ImageView) findViewById(R.id.ivVocal_e);
        ivI = (ImageView) findViewById(R.id.ivVocal_i);
        ivO = (ImageView) findViewById(R.id.ivVocal_o);
        ivU = (ImageView) findViewById(R.id.ivVocal_u);

        ivUno = (ImageView) findViewById(R.id.iv1);
        ivDos = (ImageView) findViewById(R.id.iv2);
        ivTres = (ImageView) findViewById(R.id.iv3);
        ivCuatro = (ImageView) findViewById(R.id.iv4);
        ivCinco = (ImageView) findViewById(R.id.iv5);
        ivSeis = (ImageView) findViewById(R.id.iv6);
        ivSiete = (ImageView) findViewById(R.id.iv7);
        ivOcho = (ImageView) findViewById(R.id.iv8);
        ivNueve = (ImageView) findViewById(R.id.iv9);
        ivCero = (ImageView) findViewById(R.id.iv0);

        ivPerro = (ImageView) findViewById(R.id.ivPerro);
        ivGato = (ImageView) findViewById(R.id.ivGato);
        ivTortuga = (ImageView) findViewById(R.id.ivTortuga);
        ivConejo = (ImageView) findViewById(R.id.ivConejo);

        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.blink);

        Resources res = getResources();
        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("...", res.getDrawable(android.R.drawable.title_bar));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("O", res.getDrawable(android.R.drawable.screen_background_dark_transparent));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("O", res.getDrawable(android.R.drawable.screen_background_dark_transparent));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab4");
        spec.setContent(R.id.tab4);
        spec.setIndicator("O", res.getDrawable(android.R.drawable.screen_background_dark_transparent));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab5");
        spec.setContent(R.id.tab5);
        spec.setIndicator("O", res.getDrawable(android.R.drawable.screen_background_dark_transparent));
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab6");
        spec.setContent(R.id.tab6);
        spec.setIndicator("O", res.getDrawable(android.R.drawable.screen_background_dark_transparent));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }

    private void createSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        spMama = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spHija = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spPapa = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spHijo = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        spRojo = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spAmarillo = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spVerde = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spAzul = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spCafe = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spNaranja = new SoundPool.Builder().setAudioAttributes(attributes).build();

        spPerro = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spGato = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spConejo = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spTortuga = new SoundPool.Builder().setAudioAttributes(attributes).build();

        spA= new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spE = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        spI = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spO= new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spU = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();


        spUno = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spDos = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spTres = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spCuatro = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spCinco = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spSeis = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spSiete = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spOcho= new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spNueve = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
        spCero = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        chargeSoundPool();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){
        spMama = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spPapa= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spHija= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spHijo= new SoundPool(12,AudioManager.STREAM_MUSIC,0);

        spRojo= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spAmarillo= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spVerde= new SoundPool(12,AudioManager.STREAM_MUSIC,0);
        spAzul= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spCafe= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spNaranja= new SoundPool(12,AudioManager.STREAM_MUSIC,0);

        spA= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spE= new SoundPool(12,AudioManager.STREAM_MUSIC,0);
        spI= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spO= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spU= new SoundPool(12,AudioManager.STREAM_MUSIC,0);

        spUno = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spDos= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spTres= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spCuatro= new SoundPool(12,AudioManager.STREAM_MUSIC,0);
        spCinco = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spSeis= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spSiete= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spOcho= new SoundPool(12,AudioManager.STREAM_MUSIC,0);
        spNueve = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spCero= new SoundPool(10,AudioManager.STREAM_MUSIC,0);

        spPerro= new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spGato= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spConejo= new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        spTortuga= new SoundPool(12,AudioManager.STREAM_MUSIC,0);
        chargeSoundPool();
    }

    public void chargeSoundPool() {
        resPapa = spPapa.load(getApplicationContext(), R.raw.father, 1);
        resMama = spMama.load(getApplicationContext(), R.raw.mother, 1);
        resHija = spHija.load(getApplicationContext(), R.raw.daugther, 1);
        resHijo = spHijo.load(getApplicationContext(), R.raw.son, 1);

        resRojo = spRojo.load(getApplicationContext(), R.raw.red, 1);
        resAmarillo = spAmarillo.load(getApplicationContext(), R.raw.yellow, 1);
        resVerde = spVerde.load(getApplicationContext(), R.raw.green, 1);
        resAzul = spAzul.load(getApplicationContext(), R.raw.red, 1);
        resCafe = spCafe.load(getApplicationContext(), R.raw.yellow, 1);
        resNaranja = spNaranja.load(getApplicationContext(), R.raw.green, 1);

        resA = spA.load(getApplicationContext(), R.raw.a, 1);
        resE = spE.load(getApplicationContext(), R.raw.e, 1);
        resI = spI.load(getApplicationContext(), R.raw.i, 1);
        resO = spO.load(getApplicationContext(), R.raw.o, 1);
        resU = spU.load(getApplicationContext(), R.raw.u, 1);

        resUno = spUno.load(getApplicationContext(), R.raw.one, 1);
        resDos = spDos.load(getApplicationContext(), R.raw.two, 1);
        resTres = spTres.load(getApplicationContext(), R.raw.tres, 1);
        resCuatro = spCuatro.load(getApplicationContext(), R.raw.four, 1);
        resCinco = spCinco.load(getApplicationContext(), R.raw.five, 1);
        resSeis= spSeis.load(getApplicationContext(), R.raw.six, 1);
        resSiete = spSiete.load(getApplicationContext(), R.raw.seven, 1);
        resOcho= spOcho.load(getApplicationContext(), R.raw.ocho, 1);
        resNueve = spNueve.load(getApplicationContext(), R.raw.nueve, 1);
        resCero= spCero.load(getApplicationContext(), R.raw.cero, 1);

        resPerro = spPerro.load(getApplicationContext(), R.raw.perro, 1);
        resGato = spGato.load(getApplicationContext(), R.raw.gato, 1);
        resTortuga = spTortuga.load(getApplicationContext(), R.raw.tortuga, 1);
        resConejo = spConejo.load(getApplicationContext(), R.raw.conejo, 1);
    }

    public void mama(View v) {
        if(resMama != 0){
            spMama.play(resMama, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivMama.startAnimation(animacion);
    }
    public void papa(View v) {
        if(resPapa != 0){
            spPapa.play(resPapa, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivPapa.startAnimation(animacion);
    }
    public void hijo(View v) {
        if(resHijo != 0){
            spHijo.play(resHijo, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivHijo.startAnimation(animacion);
    }
    public void hija(View v) {
        if(resHija != 0){
            spHija.play(resHija, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivHija.startAnimation(animacion);
    }


    public void rojo(View v) {
        if(resRojo != 0){
            spRojo.play(resRojo, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivRojo.startAnimation(animacion);
    }
    public void amarillo(View v) {
        if(resAmarillo != 0){
            spAmarillo.play(resAmarillo, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivAmarillo.startAnimation(animacion);
    }
    public void verde(View v) {
        if(resVerde != 0){
            spVerde.play(resVerde, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivVerde.startAnimation(animacion);
    }
    public void cafe(View v) {
        if(resCafe != 0){
            spCafe.play(resCafe, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivCafe.startAnimation(animacion);
    }
    public void azul(View v) {
        if(resAzul != 0){
            spAzul.play(resAzul, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivAzul.startAnimation(animacion);
    }
    public void naranja(View v) {
        if(resNaranja != 0){
            spNaranja.play(resNaranja, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivNaranja.startAnimation(animacion);
    }


    public void a(View v) {
        if(resA != 0){
            spA.play(resA, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivA.startAnimation(animacion);
    }
    public void e(View v) {
        if(resE != 0){
            spE.play(resE, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivE.startAnimation(animacion);
    }
    public void i(View v) {
        if(resI != 0){
            spI.play(resI, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivI.startAnimation(animacion);
    } public void o(View v) {
        if(resO != 0){
            spO.play(resO, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivO.startAnimation(animacion);
    }
    public void u(View v) {
        if(resU != 0){
            spU.play(resU, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivU.startAnimation(animacion);
    }

    public void perro(View v) {
        if(resPerro != 0){
            spPerro.play(resPerro, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivPerro.startAnimation(animacion);
    }
    public void gato(View v) {
        if(resGato != 0){
            spGato.play(resGato, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivGato.startAnimation(animacion);
    } public void tortuga(View v) {
        if(resTortuga != 0){
            spTortuga.play(resTortuga, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivTortuga.startAnimation(animacion);
    }
    public void conejo(View v) {
        if(resConejo != 0){
            spConejo.play(resConejo, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivConejo.startAnimation(animacion);
    }

    public void uno(View v) {
        if(resUno != 0){
            spUno.play(resUno, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivUno.startAnimation(animacion);
    }
    public void dos(View v) {
        if(resDos != 0){
            spDos.play(resDos, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivDos.startAnimation(animacion);
    }
    public void tres(View v) {
        if(resTres != 0){
            spTres.play(resTres, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivTres.startAnimation(animacion);
    }
    public void cuatro(View v) {
        if(resCuatro != 0){
            spCuatro.play(resCuatro, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivCuatro.startAnimation(animacion);
    }
    public void cinco(View v) {
        if(resCinco != 0){
            spCinco.play(resCinco, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivCinco.startAnimation(animacion);
    }
    public void seis(View v) {
        if(resSeis != 0){
            spSeis.play(resSeis, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivSeis.startAnimation(animacion);
    }
    public void siete(View v) {
        if(resSiete != 0){
            spSiete.play(resSiete, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivSiete.startAnimation(animacion);
    }
    public void ocho(View v) {
        if(resOcho != 0){
            spOcho.play(resOcho, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivOcho.startAnimation(animacion);
    }
    public void nueve(View v) {
        if(resNueve != 0){
            spNueve.play(resNueve, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivNueve.startAnimation(animacion);
    }
    public void cero(View v) {
        if(resCero != 0){
            spCero.play(resCero, 1, 1, 0, 0, 1);
        }
        animacion = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.blink);
        ivCero.startAnimation(animacion);
    }

    public void enviarMail() {
        String [] TO = {"mrrios51@gmail.com"};
        String [] CC = {"usuario@gmail.com"};
        String asunto = "talk me";
        String contenido = " algun comentario";

        intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, TO);
        intent.putExtra(Intent.EXTRA_CC, CC);
        intent.putExtra(Intent.EXTRA_SUBJECT, asunto);
        intent.putExtra(Intent.EXTRA_TEXT, contenido);

        startActivity(Intent.createChooser(intent, "Envia Correo"));
    }
    public void abrirPaginaWeb() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.github/MiriamRios.com"));
        startActivity(intent);
    }
    public void abrirApp() {
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.facebook/MiriamRios.com"));
        startActivity(intent);
    }

}
