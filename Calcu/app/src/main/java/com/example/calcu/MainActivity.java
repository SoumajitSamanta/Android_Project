package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstedittext;
    EditText secondedittext;
    TextView resulttextview;
    ImageButton addButton;
    ImageButton subButton;
    ImageButton mulButton;
    ImageButton divButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstedittext = findViewById(R.id.firstedittext);
        secondedittext = findViewById(R.id.secondedittext);
        resulttextview = findViewById(R.id.resulttextview);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        mulButton = findViewById(R.id.mulButton);
        divButton = findViewById(R.id.divButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstInt = Double.parseDouble(firstedittext.getText().toString());
                Double secondInt = Double.parseDouble(secondedittext.getText().toString());
                Double result = firstInt + secondInt;
                resulttextview.setText(firstInt + "+" + secondInt + "=" + result);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstInt = Double.parseDouble(firstedittext.getText().toString());
                Double secondInt = Double.parseDouble(secondedittext.getText().toString());
                Double result = firstInt - secondInt;
                resulttextview.setText(firstInt + "-" + secondInt + "=" + result);
            }
        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstInt = Double.parseDouble(firstedittext.getText().toString());
                Double secondInt = Double.parseDouble(secondedittext.getText().toString());
                Double result = firstInt * secondInt;
                resulttextview.setText(firstInt + "x" + secondInt + "=" + result);
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstInt = Double.parseDouble(firstedittext.getText().toString());
                Double secondInt = Double.parseDouble(secondedittext.getText().toString());
                Double result = firstInt / secondInt;
                resulttextview.setText(firstInt + "/" + secondInt + "=" + result);
            }
        });
    }
}