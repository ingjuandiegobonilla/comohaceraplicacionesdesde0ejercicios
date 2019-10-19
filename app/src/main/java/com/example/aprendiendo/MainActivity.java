package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText saveText;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveText = findViewById(R.id.save_text);
        saveButton = findViewById(R.id.save_button);

        SharedPreferences pref = getSharedPreferences("textoGuardado", Context.MODE_PRIVATE);
        saveText.setText(pref.getString("dato", ""));

        saveButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.save_button:
                String dato = saveText.getText().toString();
                SharedPreferences preferencias = getSharedPreferences("textoGuardado", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencias.edit();
                editor.putString("dato",dato);
                editor.commit();
                finish();
                break;
            default:
                break;


        }

    }
}
