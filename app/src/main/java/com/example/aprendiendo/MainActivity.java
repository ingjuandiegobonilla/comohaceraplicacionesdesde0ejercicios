package com.example.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anime anime_datos[] = new Anime[]{
                new Anime(R.drawable.monkey,"One Piece"),
                new Anime(R.drawable.monkey,"Fairy Tail"),
                new Anime(R.drawable.monkey,"Naruto"),
                new Anime(R.drawable.monkey,"Bleach"),
                new Anime(R.drawable.monkey,"Shingeki no Kyojin"),
                new Anime(R.drawable.monkey,"Nanatsu no taizai"),
                new Anime(R.drawable.monkey,"Boku no hero academia"),
                new Anime(R.drawable.monkey,"Shokugeki no souma"),
                new Anime(R.drawable.monkey,"Psycho pass"),
        };

        AnimeAdapter adapter = new AnimeAdapter(this,R.layout.list_view_items,anime_datos);

        lv = findViewById(R.id.lista_de_anime);
        View header = getLayoutInflater().inflate(R.layout.list_header,null);
        lv.addHeaderView(header);
        lv.setAdapter(adapter);

    }

    public void onItemClick(AdapterView<?>arg0, View arg1, int arg2, long arg3){
        TextView v = arg1.findViewById(R.id.tituloAnime);
        Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
    }


}
