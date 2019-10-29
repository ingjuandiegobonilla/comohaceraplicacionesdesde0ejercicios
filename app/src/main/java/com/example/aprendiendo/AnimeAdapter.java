package com.example.aprendiendo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AnimeAdapter extends ArrayAdapter<Anime> {
    Context context;
    int layoutResourceId;
    Anime data[] = null;

    static class AnimeHolder {
        ImageView imagen;
        TextView texto;
    }

    public AnimeAdapter (Context context, int layoutResourceId, Anime[] data){
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View row = convertView;
        AnimeHolder holder = null;

        if(row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new AnimeHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagenAnime);
            holder.texto = (TextView) row.findViewById(R.id.tituloAnime);
        }else{
            holder =(AnimeHolder)row.getTag();
        }

        Anime anime = data[position];
        holder.texto.setText(anime.title);
        holder.imagen.setImageResource(anime.icon);


        return row;
    }

}
