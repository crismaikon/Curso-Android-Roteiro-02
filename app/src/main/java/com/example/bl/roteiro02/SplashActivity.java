package com.example.bl.roteiro02;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity implements Runnable {

    private static int Dellay = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Handler handler = new Handler();
        handler.postDelayed(this, Dellay);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
