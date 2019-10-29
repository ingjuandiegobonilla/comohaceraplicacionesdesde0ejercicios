package com.example.aprendiendo;

import android.os.AsyncTask;

public class Asincrona extends AsyncTask {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException e){
                Thread.interrupted();
            }
        }
        return "Executed";
    }


}
