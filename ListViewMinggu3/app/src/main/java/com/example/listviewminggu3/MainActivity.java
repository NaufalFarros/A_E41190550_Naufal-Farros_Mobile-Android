package com.example.listviewminggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnListView, btnRecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListView = findViewById(R.id.list_view);
        btnListView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ListViewActivity.class));
        });

        btnRecycleView = findViewById(R.id.recycle_view);
        btnRecycleView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RecycleViewActivity.class));
        });
    }
}