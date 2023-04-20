package com.example.animationlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    TextView sview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sview = findViewById(R.id.textView);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        sview.setAnimation(anim);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
            boolean handler = new Handler().postDelayed(new Runnable(){
                @Override
                public void run()
                {
                    Intent i = new Intent(getApplicationContext(),animation.class);
                    startActivity(i);
                    finish();
                }
            },this,4000);
        }
    }
}
