package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button runThread;
    int i;
    Button startHandler;
    final Handler handle = new Handler();

    protected void Hilo(){
        Thread hilo = new Thread(){
            public void run(){
                try{
                    System.out.println("Empieza el conteo");
                    Thread.sleep(10000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                handle.post(runnable);
            }
        };
        hilo.start();
    }
    final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Toast.makeText(MainActivity.this,"Estamis en el hilo",Toast.LENGTH_SHORT).show();
        }
    };

    Button asyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runThread = findViewById(R.id.run_thread);
        runThread.setOnClickListener(this);
        i = 0;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (i = 0; i < 10000; i++) {
                    System.out.println(i);

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        startHandler = findViewById(R.id.start_handler);
        startHandler.setOnClickListener(this);
        asyncTask = findViewById(R.id.asynctask);
        asyncTask.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.run_thread:
                String valor = String.valueOf(i);
                Toast.makeText(MainActivity.this, valor, Toast.LENGTH_SHORT).show();
                break;
            case R.id.start_handler:
                Toast.makeText(MainActivity.this,"Iniciaremos el hilo",Toast.LENGTH_SHORT).show();
                Hilo();
                break;
            case R.id.asynctask:
                new Asincrona().execute();
                break;
            default:
                break;
        }
    }
}
