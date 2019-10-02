package com.example.lista2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Abrir1(View view) {
        Intent it = new Intent(MainActivity.this, Parte1.class);
        startActivity(it);
    }

    public void Abrir2(View view) {
        Intent it = new Intent(MainActivity.this, Parte2.class);
        startActivity(it);
    }
    public void Abrir3(View view) {
        Intent it = new Intent(MainActivity.this, Parte3.class);
        startActivity(it);
    }
    public void Abrir4(View view) {
        Intent it = new Intent(MainActivity.this, Parte4.class);
        startActivity(it);
    }
}
