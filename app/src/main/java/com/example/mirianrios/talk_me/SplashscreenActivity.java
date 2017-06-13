package com.example.mirianrios.talk_me;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Mirian Rios on 2017-05-22.
 */

public class SplashscreenActivity extends AppCompatActivity {

    private ImageView ivLogo;
    private Animation animacion;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);

        ivLogo = (ImageView) findViewById(R.id.ivLogotipo);

        animacion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splashscreen);
        ivLogo.startAnimation(animacion);

        mediaplayer = MediaPlayer.create(getApplicationContext(),R.raw.audio);
        mediaplayer.start();


        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );
                startActivity(i);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
