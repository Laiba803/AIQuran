package com.example.quranapp2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<SurahModel> SurahNames = new ArrayList<>();
    String lang;
    String Translator;

    myRecyclerViewAdapter(String language,String trans) {
        lang = language;
        Translator = trans;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SurahModel item = SurahNames.get(position);

        myRecyclerViewAdapter.VH ViewHolder = (myRecyclerViewAdapter.VH) holder;
        ViewHolder.Text.setText(item.getSurahName());
        if(lang == "urdu") {
            //ViewHolder.Text.setTypeface(ResourcesCompat.getFont(ViewHolder.context, R.font.noorehuda));
        }
        else{
            ViewHolder.Text.setTypeface(ResourcesCompat.getFont(ViewHolder.context, R.font.jameel_noori_nastaleeq));
        }

        ViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Ayahs.class);
                intent.putExtra("SurahNum", item.SurahNum);
                intent.putExtra("Required", lang);
                intent.putExtra("Translator" , Translator);
                intent.putExtra("SurahName", item.getSurahName());
                view.getContext().startActivity(intent);
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


    public class VH extends RecyclerView.ViewHolder {
        TextView Text;
        Context context;

        public VH(@NonNull View itemView) {
            super(itemView);
            Text = itemView.findViewById(R.id.arabic_text);
            context=itemView.getContext();
        }
    }
}