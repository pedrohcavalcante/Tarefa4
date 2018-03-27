package com.example.pedro.tarefa4;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Boolean.FALSE;

public class Questao1 extends Activity{

    private Button btnProcessar;
    private TextView contador;
    private Handler contagem;
    private int valor;
    private int i = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        contagem = new Handler();
        contador = findViewById(R.id.id_contador);
        contador.setVisibility(View.VISIBLE);
        contador.setText("99999");
        btnProcessar = findViewById(R.id.processar);
    }

    public void processar(View view){
        btnProcessar.setEnabled(false);
            executarContagem();

    }

    private void executarContagem(){

        new Thread() {
            @Override
            public void run() {
                        for (i = 10; i >= 0; i--) {
                            contador.post(new Runnable() {
                                @Override
                                public void run() {
                                    contador.setText(Integer.toString(i));
                                }
                            });
                            SystemClock.sleep(1000);
                        }
            }
        }.start();

    }
}
