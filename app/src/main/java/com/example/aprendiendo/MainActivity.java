package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Derecha derecha = new Derecha();
        fragmentTransaction.add();
        fragmentTransaction.commit();

        Izquierda izquierda = new Izquierda();
        fragmentTransaction.add(R.id.izquierda,izquierda);
        fragmentTransaction.commit();
        }



    }


    @Override
    public void enviarDatos(String mensaje) {
        Derecha derecha = (Derecha) getFragmentManager().findFragmentById(R.id.derecha);
        derecha.ObtenerDatos(mensaje);
    }
}
