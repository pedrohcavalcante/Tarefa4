package com.example.pedro.tarefa4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button questao1;
    private Button questao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questao1 = findViewById(R.id.btn_q1);
        questao2 = findViewById(R.id.btn_q2);
    }

    public void questao1Func(View view){
        Intent q1 = new Intent(getApplicationContext(), this);

    }

    public void questao2Func(View view){

    }
}
