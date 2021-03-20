package com.example.tugasminggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class RelativeLayout extends AppCompatActivity {
    EditText  reminder ;
    Spinner   dates, times ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);



        reminder=findViewById(R.id.reminder);
        dates=findViewById(R.id.dates);
        times=findViewById(R.id.times);



    }
}