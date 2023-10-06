package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
        TextInputEditText textInputEditemail, textInputEditpassword;
        Button button;
        TextView textViewforget, textViewcreate;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

//        textInputEditemail=findViewById(R.id.email);
//        textInputEditpassword=findViewById(R.id.password);
//        button=findViewById(R.id.button);
            textViewforget=findViewById(R.id.forget);
            textViewcreate=findViewById(R.id.create);
//
            textViewforget.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, forgetPass.class);
                    startActivity(intent);
                }
            });

            textViewcreate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, CreateNew.class);
                    startActivity(intent);
                }
            });
        }
    }