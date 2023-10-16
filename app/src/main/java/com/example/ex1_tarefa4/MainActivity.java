package com.example.ex1_tarefa4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SortearNumero(View view){

        TextView sorteio = findViewById(R.id.numSorteio);
        int x = new Random().nextInt(101);
        sorteio.setText("Número sorteado: " + x);
    }

}