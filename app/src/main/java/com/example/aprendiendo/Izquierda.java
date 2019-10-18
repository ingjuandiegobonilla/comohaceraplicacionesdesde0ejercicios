package com.example.aprendiendo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Izquierda extends Fragment {


    View rootView;
    Button boton;
    EditText campo;
    EnviarMensaje EM;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.izquierda, container, false);
        campo = rootView.findViewById(R.id.campotxt);
        boton = rootView.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje;
                mensaje = campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });
        return rootView;
    }
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            EM = (EnviarMensaje) activity;
        } catch(ClassCastException e){
            throw new ClassCastException("Necesitas implementar un msg");
        }
    }

}
