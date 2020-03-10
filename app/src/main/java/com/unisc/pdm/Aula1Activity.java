package com.unisc.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Aula1Activity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoCalcula;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula1);

        caixaTexto = findViewById(R.id.edt_number);
        botaoCalcula =  findViewById(R.id.btn_calcular);
        resultado = findViewById(R.id.tv_resultado);

        botaoCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String para recuperar texto
                String textoDigitado = caixaTexto.getText().toString();
                if(textoDigitado.isEmpty()){
                    //caso vazio
                    resultado.setText("Digite um valor Valido!");
                }else{
                    //caso correto
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = (valorDigitado * 9)/5+32;

                    resultado.setText("O Valor em Graus Fahrenheit é "+resultadoFinal+".");
                }
            }
        });

    };

    public void btn_voltar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
