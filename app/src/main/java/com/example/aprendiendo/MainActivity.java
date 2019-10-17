package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView monkey;
    Button rotar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monkey = findViewById(R.id.monkey);
        rotar = findViewById(R.id.rotateButton);
        rotar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.rotateButton:
                Animation rotacion;
                rotacion = AnimationUtils.loadAnimation(this,R.anim.rotate);
                rotacion.reset();
                monkey.startAnimation(rotacion);
            break;
            default:
                break;
        }

    }
}
