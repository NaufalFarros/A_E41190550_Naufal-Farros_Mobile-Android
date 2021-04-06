package com.example.listviewminggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView rvMahasiswa ;
    private MahasiswaAdapter adapterMahasiswa ;
    private ArrayList<Mahasiswa> mDataMahasiswa ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        addData();
        adapterMahasiswa = new  MahasiswaAdapter(mDataMahasiswa);
        rvMahasiswa = findViewById(R.id.rvMahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);
    }

    private  void addData(){
        mDataMahasiswa= new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa("Naufal Farros","E41190550","082235236662"));
        mDataMahasiswa.add(new Mahasiswa("Ferry Setiawan","E41190551","123456789"));
        mDataMahasiswa.add(new Mahasiswa("Sandika Permana","E41190552","082423497247"));
        mDataMahasiswa.add(new Mahasiswa("Erry Julev","E41190553","0812384238472"));
    }
}