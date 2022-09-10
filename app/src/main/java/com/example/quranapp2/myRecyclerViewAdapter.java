package com.example.quranapp2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<SurahModel> SurahNames = new ArrayList<>();
    String req;

    myRecyclerViewAdapter(String req) {
        this.req = req;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.surah_urdu, parent, false);
        return new myRecyclerViewAdapter.VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SurahModel item = SurahNames.get(position);
        myRecyclerViewAdapter.VH ViewHolder = (myRecyclerViewAdapter.VH) holder;
        ViewHolder.Text.setText(item.getSurahName());
        ViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

    }

    public void setData(ArrayList<SurahModel> surahNames) {
        this.SurahNames = surahNames;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return SurahNames.size();
    }


    public static class VH extends RecyclerView.ViewHolder {
        TextView Text;

        public VH(@NonNull View itemView) {
            super(itemView);

        }
    }
}