package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_calcular;
    EditText numero;
    TextView txt_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calcular = findViewById(R.id.btn_calcular);
        numero = findViewById(R.id.numero);
        txt_resultado = findViewById(R.id.txt_resultado);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int _numero = Integer.parseInt(numero.getText().toString());
                String parImpar = "";
                String primo = "";
                if(_numero % 2 == 0){
                    parImpar = "sim";
                }
                else{
                    parImpar = "nao";
                }

                int cont = 0;
                for (int i = 0; i<= _numero;i++){
                    if(_numero % 1 == 0){
                        cont++;
                    }
                }
                if (cont == 2){
                    primo = "sim";
                }
                else{
                    primo = "nao"; 
                }

                txt_resultado.setText("Primo "+primo+ " | " + "Paridade "+parImpar);
            }
        });
    }
}