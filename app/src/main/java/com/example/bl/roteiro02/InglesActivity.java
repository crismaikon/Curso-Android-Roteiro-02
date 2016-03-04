package com.example.bl.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InglesActivity extends AppCompatActivity {

    private TextView textView;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingles);

        textView = (TextView)findViewById(R.id.ingles);
        btn = (Button)findViewById(R.id.voltar);

        String cor;

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        cor = bundle.getString("texto");

        if(cor.equalsIgnoreCase("amarelo") || cor.equalsIgnoreCase("amarelo ")){
            textView.setText("YELLOW");
        }
        if(cor.equalsIgnoreCase("azul") || cor.equalsIgnoreCase("azul ")){
            textView.setText("BLEU");
        }
        if(cor.equalsIgnoreCase("vermelho") || cor.equalsIgnoreCase("vermelho ")){
            textView.setText("RED");
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
