package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play,pause;
    public MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        play.setOnClickListener(this);
        pause = findViewById(R.id.pause);
        pause.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                play_mp();
                break;
            case R.id.pause:
                stop_mp();
                break;
            default:
                break;
        }
    }
    private void play_mp() {
        mp = MediaPlayer.create(this, R.raw.audio);
        mp.start();
    }
    private void stop_mp(){
        mp.stop();
    }
}

