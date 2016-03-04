package com.example.bl.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText mText;
    private Button btn;
    private Button ingles;
    private Button frances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.traduzir);
        ingles = (Button) findViewById(R.id.ingles);
        frances = (Button) findViewById(R.id.frances);
        mText = (EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = mText.getText().toString();

                if (verificaCor(texto) || verificaCor(texto)) {

                    Bundle bundle = new Bundle();
                    bundle.putString("texto", texto);
                    Intent intent = new Intent("TRADUZIR");
                    intent.putExtras(bundle);
                    startActivity(intent);


                }
            }

        });

        ingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = mText.getText().toString();

                if (verificaCor(texto) || verificaCor(texto)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("texto", texto);
                    Intent intent = new Intent("TRADUZIR");
                    intent.addCategory("INGLES");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            }
        });

        frances.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String texto = mText.getText().toString();

                if (verificaCor(texto) || verificaCor(texto)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("texto", texto);
                    Intent intent = new Intent("TRADUZIR");
                    intent.addCategory("FRANCES");
                    intent.putExtras(bundle);

                    startActivity(intent);

                }
            }
        });
    }


    private boolean verificaCor(String texto) {
        View focus = null;

        if (texto.equalsIgnoreCase("azul") || texto.equalsIgnoreCase("amarelo") || texto.equalsIgnoreCase("vermelho") || texto.equalsIgnoreCase("azul ") || texto.equalsIgnoreCase("amarelo ") || texto.equalsIgnoreCase("vermelho ")) {
            return true;
        } else {
            mText.setError("Cor invalida digite novamente");
            focus = mText;
            focus.requestFocus();

            return false;
        }

    }

    private boolean vereficaVazio(String texto) {
        View focus = null;
        if (TextUtils.isEmpty(texto)) {
            mText.setError("Campo vazio");
            focus = mText;
            focus.requestFocus();

            return false;
        }
        return true;
    }
}

