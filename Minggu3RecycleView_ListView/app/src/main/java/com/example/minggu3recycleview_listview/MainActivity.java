package com.example.minggu3recycleview_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnListView,btnRecycleView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListView = findViewById(R.id.listView);
        btnListView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ListViewActivity.class));
        });
    }
}