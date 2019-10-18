package com.example.aprendiendo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Derecha extends Fragment {

    View rootview;
    Text txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        rootview = inflater.inflate(R.layout.derecha, container, false);
        txt = rootview.findViewById(R.id.txt);
        return rootview;


    }

    public void ObtenerDatos(String mensaje){
        txt.setTextContent(mensaje);
    }
}
