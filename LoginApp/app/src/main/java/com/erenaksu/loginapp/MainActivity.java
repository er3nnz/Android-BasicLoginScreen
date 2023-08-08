package com.erenaksu.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText text ;
    EditText edit;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        edit=findViewById(R.id.editTextTextPassword);
        text=findViewById(R.id.editTextText);
        textView=findViewById(R.id.textView3);
    }

    public void buttonClick(View view){
            if(text.getText().toString().matches("") || edit.getText().toString().matches("")){
              textView.setText("Lutfen Kullanici Adinizi Sifrenizi Tam Giriniz...");
            }
            else{
                textView.setText("Kullanici Kaydolmustur...");
            }
        }
    }