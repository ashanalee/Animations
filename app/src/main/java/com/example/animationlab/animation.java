package com.example.animationlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class animation extends AppCompatActivity {
    TextView vieww;
    Button blink,rotate,slide,fade,zoom,move, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        vieww  = findViewById(R.id.name);
        blink = findViewById(R.id.blink);
        rotate = findViewById(R.id.rotatae);
        slide = findViewById(R.id.slide);
        fade = findViewById(R.id.fade);
        zoom = findViewById(R.id.zoom);
        move = findViewById(R.id.move);

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.BounceIn).duration(1000).repeat(0).playOn(vieww);

            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                vieww.startAnimation(rotate);

            }
        });

        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.SlideInLeft).duration(1000).repeat(0).playOn(vieww);
            }
        });

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation fade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                vieww.startAnimation(fade);

            }
        });

        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                vieww.startAnimation(zoom);

            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation slide = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                vieww.startAnimation(slide);
            }
        });

        stop=findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vieww.clearAnimation();
            }
        });
    }
}

