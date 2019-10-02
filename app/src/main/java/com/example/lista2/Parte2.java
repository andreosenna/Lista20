package com.example.lista2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Parte2 extends Activity {
    private EditText valor1Real,valor1Imaginario, valor2Real,valor2Imaginario;
    private TextView resultSoma1,resultSoma2,resultSoma3,resultSoma4;
    private TextView resultSubtração1,resultSubtração2,resultSubtração3,resultSubtração4;
    private TextView resultProduto1,resultProduto2,resultProduto3,resultProduto4;
    private TextView resultDivisao1,resultDivisao2,resultDivisao3,resultDivisao4;

    private Button btCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte2);
        valor1Real = (EditText) findViewById(R.id.valor1Real);
        valor1Imaginario = (EditText) findViewById(R.id.valor1Imaginario);
        valor2Real = (EditText) findViewById(R.id.valor2Real);
        valor2Imaginario = (EditText) findViewById(R.id.valor2Imaginario);
        resultSoma1 = (TextView) findViewById(R.id.resultSoma1);
        resultSoma2 = (TextView) findViewById(R.id.resultSoma2);
        resultSoma3 = (TextView) findViewById(R.id.resultSoma3);
        resultSoma4 = (TextView) findViewById(R.id.resultSoma4);

        resultSubtração1 = (TextView) findViewById(R.id.resultSubtração1);
        resultSubtração2 = (TextView) findViewById(R.id.resultSubtração2);
        resultSubtração3 = (TextView) findViewById(R.id.resultSubtração3);
        resultSubtração4 = (TextView) findViewById(R.id.resultSubtração4);

        resultProduto1 = (TextView) findViewById(R.id.ResultProduto1);
        resultProduto2 = (TextView) findViewById(R.id.ResultProduto2);
        resultProduto3 = (TextView) findViewById(R.id.ResultProduto3);
        resultProduto4 = (TextView) findViewById(R.id.ResultProduto4);

        resultDivisao1 = (TextView) findViewById(R.id.resultDivisao1);
        resultDivisao2 = (TextView) findViewById(R.id.resultDivisao2);
        resultDivisao3 = (TextView) findViewById(R.id.resultDivisao3);
        resultDivisao4 = (TextView) findViewById(R.id.resultDivisao4);
        btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double valorReal1 = Double.parseDouble(valor1Real.getText().toString());
                    double valorImaginario1 = Double.parseDouble(valor1Imaginario.getText().toString());
                    double valorReal2 = Double.parseDouble(valor2Real.getText().toString());
                    double valorImaginario2 = Double.parseDouble(valor2Imaginario.getText().toString());
                    Double[] som1 =calcSoma(valorReal1, valorImaginario1, valorReal2, valorImaginario2);
                    resultSoma1.setText(String.format("%.2f",som1[0] ));
                    resultSoma2.setText(String.format("%.2f", som1[1]));




                    Double[] sub1 =calcSubtracao(valorReal1, valorImaginario1, valorReal2, valorImaginario2);
                    resultSubtração1.setText(String.format("%.2f",sub1[0] ));
                    resultSubtração2.setText(String.format("%.2f", sub1[1]));

                    Double[] prod1 = calcMultiplicacao(valorReal1, valorReal2,valorImaginario1, valorImaginario2);
                    double prodUm = prod1[0];
                    double prodDois = prod1[1];
                    resultProduto1.setText(String.format("%.2f",prodUm));
                    resultProduto2.setText(String.format("%.2f",prodDois));

                    resultDivisao1.setText(String.format("%.2f", calcDivisao(valorReal1, valorReal2)));
                    resultDivisao2.setText(String.format("%.2f", calcDivisao(valorImaginario1, valorImaginario2)));
                    double num3, num4;
                    if (prodUm >= 0) {

                        num3 = Math.sqrt(Math.pow(valorReal1, 2) + Math.pow(valorReal2, 2));
                        num4 = Math.atan(valorReal2 / valorReal1);
                        num4 = Math.toDegrees(num4);
                    } else {
                        num3 = Math.sqrt(Math.pow(valorReal1, 2) + Math.pow(valorReal1, 2));
                        num4 = Math.atan(valorReal2 / valorReal1);
                        num4 = Math.toDegrees(num4) + 180;
                    }
                    resultSoma3.setText(String.format("%.2f",num3));
                    resultSoma4.setText(String.format("%.2f",num4));
                } catch (Exception e) {

                    Toast.makeText(Parte2.this, "valor Incorreto", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private Double[] calcSoma(Double NumeroReal1, Double NumeroImaginario1, Double NumeroReal2, Double NumeroImaginario2){
        Double[] resultado = new Double[2];
        resultado[0] = NumeroReal1+NumeroReal2;
        resultado[1]=  NumeroImaginario1+NumeroImaginario2;
        return resultado;
    }
    private Double[] calcSubtracao(Double NumeroReal1, Double NumeroImaginario1, Double NumeroReal2, Double NumeroImaginario2){
        Double[] resultado = new Double[2];
        resultado[0] = NumeroReal1-NumeroReal2;
        resultado[1]=  NumeroImaginario1-NumeroImaginario2;
        return resultado;
    }
    private Double[] calcMultiplicacao(Double numeroReal1, Double numeroReal2, Double numeroImaginario1, Double numeroImaginário2){
        Double[] real = new Double[]{numeroReal1,numeroReal2};
        Double[] imaginario = new Double[]{numeroImaginario1,numeroImaginário2};
        Double[] resultado= new Double[2];
        resultado[0] = real[0]*imaginario[0]+real[1]*imaginario[1];
        resultado[1] = real[1]*imaginario[1]+real[1]*imaginario[1];
        return resultado;
    }
    private Double calcDivisao(Double numero1, Double numero2){
        Double resultado;
        return resultado = numero1/numero2;
    }
    public void voltarInicio(View view) {
        Intent it = new Intent(Parte2.this, MainActivity.class);
        startActivity(it);
    }

    public void btProximo(View view) {
        Intent it = new Intent(Parte2.this, Parte3.class);
        startActivity(it);
    }
}

