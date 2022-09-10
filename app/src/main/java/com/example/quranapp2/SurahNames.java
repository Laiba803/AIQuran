package com.example.quranapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class SurahNames extends AppCompatActivity {
    RecyclerView rc;
    QDH qdh=new QDH();
    String[] names;
    ArrayList<SurahModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surah_urdu);
        rc = findViewById(R.id.myRC);

        Intent intent = getIntent();
        String translator = intent.getStringExtra("required");
        String lang = intent.getStringExtra("language");

        myRecyclerViewAdapter adapter = new myRecyclerViewAdapter(lang,translator);
        rc.setAdapter(adapter);

        rc.setLayoutManager(new LinearLayoutManager(this));

        if(lang =="Fateh_Muhammad_Jalandhri" || lang =="mehmood_ul_hassan")
        {
            names = qdh.GetUrduSurahNames();
        }
        else if(lang =="Fateh_Muhammad_Jalandhri_eng" || lang == "Mufti_Taqi_Usmani")
        {
            names = qdh.GetEngSurahNames();
        }
        for(int i=0; i < names.length;i++)
        {
            int j=i+1;
            list.add(new SurahModel(names[i],j));
        }
        adapter.setData(list);
    }
}