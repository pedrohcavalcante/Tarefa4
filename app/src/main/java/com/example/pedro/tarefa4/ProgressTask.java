package com.example.pedro.tarefa4;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * Created by Pedro Henrique on 27/03/2018.
 */

public class ProgressTask extends AsyncTask<Integer, Integer, Void> {

    private Button btnProcessar;
    private ProgressBar barraView;
    private int max;

    public ProgressTask(Button button, ProgressBar barra, int valor){
        this.btnProcessar = button;
        this.barraView = barra;
        max = valor;
    }

    @Override
    protected Void doInBackground(Integer... integers) {
        for (int i = 0; i <= max; i++) {
            SystemClock.sleep(integers[0]);
            publishProgress(i);
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        btnProcessar.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        int update = values[0];
        barraView.setProgress(update);

    }
}
