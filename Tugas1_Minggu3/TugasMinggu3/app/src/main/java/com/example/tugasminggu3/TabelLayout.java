package com.example.tugasminggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabelLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_layout);

        EditText screenName,password ;
        Button save ;

        screenName=findViewById(R.id.screenName);
        password=findViewById(R.id.password);

        save=findViewById(R.id.save);
    }
}