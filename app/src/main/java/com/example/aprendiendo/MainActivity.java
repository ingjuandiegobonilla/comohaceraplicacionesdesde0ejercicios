package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity  {

    AutoCompleteTextView monthsSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] months = getResources().getStringArray(R.array.meses);
        monthsSearch = findViewById(R.id.autocomplete_months);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,months);
        monthsSearch.setAdapter(adapter);
    }


}
