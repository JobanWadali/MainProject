package com.example.admin.mainproject;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView i = findViewById(R.id.et1);

        Animation alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);

        i.setAnimation(alpha);

        alpha.start();

        Handler h = new Handler();

        Runnable r = new Runnable() {
            @Override
            public void run() {


            }
        };

        h.postDelayed(r,7000);
    }
}
