package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstedittext = findViewById(R.id.firstedittext);
    EditText secondedittext = findViewById(R.id.secondedittext);
    TextView resulttextview = findViewById(R.id.resulttextview);
    Button button = findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setOnClickListener(v -> {
            int firstInt = Integer.parseInt(firstedittext.getText().toString());
            int secondInt = Integer.parseInt(secondedittext.getText().toString());
            int result = firstInt + secondInt;
            resulttextview.setText(result);
        });
    }
}