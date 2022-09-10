package com.example.quranapp2;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mySurahTextAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    String lang;
    ArrayList<TransaltionModel> SurahTrans = new ArrayList<>();

    public mySurahTextAdapter(String lang) {
        this.lang = lang;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.surah_text_adapter, parent, false);
        return new mySurahTextAdapter.myVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TransaltionModel item = SurahTrans.get(position);
        mySurahTextAdapter.myVH ViewHolder = (mySurahTextAdapter.myVH) holder;
        ViewHolder.Arabic_text.setText(item.getArabic());
        ViewHolder.Trans_text.setText(item.getTranslation());

        ViewHolder.Arabic_text.setTypeface(ResourcesCompat.getFont(ViewHolder.context, R.font.noorehuda));

        if(lang == "english") {
            ViewHolder.Trans_text.setTypeface(ResourcesCompat.getFont(ViewHolder.context, R.font.jameel_noori_nastaleeq));
        }
    }

    public void setData(ArrayList<TransaltionModel> data) {
        this.SurahTrans = data;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return SurahTrans.size();
    }


    public class myVH extends RecyclerView.ViewHolder {

        TextView Arabic_text;
        TextView Trans_text;
        Context context;

        public myVH(@NonNull View itemView) {
            super(itemView);
            Arabic_text = itemView.findViewById(R.id.arabic_text);
            Trans_text = itemView.findViewById(R.id.translation);
            context=itemView.getContext();
        }
    }
}
