package com.example.lista2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Parte1 extends AppCompatActivity {
private EditText valor1Real,valor1Imaginario, valor2Real,valor2Imaginario;
private TextView ResultSoma1,ResultSoma2,ResultSoma3,ResultSoma4;
private TextView ResultSubtração1,ResultSubtração2,ResultSubtração3,ResultSubtração4;
private TextView ResultProduto1,ResultProduto2,ResultProduto3,ResultProduto4;
private TextView ResultDivisao1,ResultDivisao2,ResultDivisao3,ResultDivisao4;

private Button btCalcular;
private Double Valor1, Valor2;

//private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte1);
        valor1Real = (EditText) findViewById(R.id.valor1Real);
        valor1Imaginario = (EditText) findViewById(R.id.valor1Imaginario);
        valor2Real = (EditText) findViewById(R.id.valor2Real);
        valor2Imaginario = (EditText) findViewById(R.id.valor2Imaginario);
        ResultSoma1 = (TextView) findViewById(R.id.resultSoma1);
        ResultSoma2 = (TextView) findViewById(R.id.resultSoma2);
        ResultSoma3 = (TextView) findViewById(R.id.resultSoma3);
        ResultSoma4 = (TextView) findViewById(R.id.resultSoma4);

        ResultSubtração1 = (TextView) findViewById(R.id.resultSubtração1);
        ResultSubtração2 = (TextView) findViewById(R.id.resultSubtração2);
        ResultSubtração3 = (TextView) findViewById(R.id.resultSubtração3);
        ResultSubtração4 = (TextView) findViewById(R.id.resultSubtração4);

        ResultProduto1 = (TextView) findViewById(R.id.ResultProduto1);
        ResultProduto2 = (TextView) findViewById(R.id.ResultProduto2);
        ResultProduto3 = (TextView) findViewById(R.id.ResultProduto3);
        ResultProduto4 = (TextView) findViewById(R.id.ResultProduto4);

        ResultDivisao1 = (TextView) findViewById(R.id.resultDivisao1);
        ResultDivisao2 = (TextView) findViewById(R.id.resultDivisao2);
        ResultDivisao3 = (TextView) findViewById(R.id.resultDivisao3);
        ResultDivisao4 = (TextView) findViewById(R.id.resultDivisao4);
        btCalcular = (Button) findViewById(R.id.BtCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1= Double.parseDouble(valor1Real.getText().toString());
//dasadsd
            }
        });

    }
}
