package com.example.listviewminggu3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private ArrayList<Mahasiswa> datalist ;

    public MahasiswaAdapter(ArrayList<Mahasiswa> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.text_nama.setText(datalist.get(position).getNama());
        holder.text_nim.setText(datalist.get(position).getNim());
        holder.text_nohp.setText(datalist.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView text_nama,text_nim, text_nohp ;
        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            text_nama = itemView.findViewById(R.id.text_nama_mahasiswa);
            text_nim = itemView.findViewById(R.id.text_nim_mahasiswa);
            text_nohp = itemView.findViewById(R.id.text_nohp_mahasiswa);
        }
    }
}