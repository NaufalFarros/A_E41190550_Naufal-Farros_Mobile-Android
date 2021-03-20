package com.example.tugasminggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.TextView;

public class ConstraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        TextView  textView ;
        CardView  cardView , cardview2;

        textView=findViewById(R.id.textView);

        cardView= findViewById(R.id.cardView);
        cardview2= findViewById(R.id.cardViews2);
    }
}