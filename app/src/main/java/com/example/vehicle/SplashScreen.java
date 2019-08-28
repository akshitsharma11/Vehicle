package com.example.vehicle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Button btngetstarted;
    ImageView splashimage;
    Animation frombottom,fromtop;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        btngetstarted=findViewById(R.id.btngetstarted);
        splashimage=findViewById(R.id.splashimage);

        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        btngetstarted.setAnimation(frombottom);
        fromtop=AnimationUtils.loadAnimation(this,R.anim.fromtop);
        splashimage.setAnimation(fromtop);


        btngetstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
