package com.example.bl.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FranceActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);


        Button btn = (Button) findViewById(R.id.f_voltar);
        textView = (TextView)findViewById(R.id.t_frances);

        String cor;

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        cor = bundle.getString("texto");

        if(cor.equalsIgnoreCase("amarelo") || cor.equalsIgnoreCase("amarelo ")){
            textView.setText("JAUNE");
        }
        if(cor.equalsIgnoreCase("azul") || cor.equalsIgnoreCase("azul ")){
            textView.setText("BLEU");
        }
        if(cor.equalsIgnoreCase("vermelho") || cor.equalsIgnoreCase("vermelho ")){
            textView.setText("ROUGE");
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
