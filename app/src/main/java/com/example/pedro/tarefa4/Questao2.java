package com.example.pedro.tarefa4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Questao2 extends Activity{

    private Button btnProcessar;
    private ProgressBar progressBar;
    private int valor = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);

        btnProcessar = findViewById(R.id.btnProcessar);
        progressBar = findViewById(R.id.progressBar);

        progressBar.setProgress(0);
        progressBar.setMax(valor);
    }

    public void processar(View view){
        btnProcessar.setEnabled(false);
        ProgressTask tarefa = new ProgressTask(btnProcessar, progressBar, valor);
        tarefa.execute(1000);
    }
}


