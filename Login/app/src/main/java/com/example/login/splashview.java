package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.window.SplashScreenView;

public class splashview extends AppCompatActivity {
    Thread tread = new Thread(){
        @Override
        public void run() {
            try {
                sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                Intent intent = new Intent(splashview.this, MainActivity.class);
                startActivity(intent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashview);

       tread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        tread.stop();
    }
}