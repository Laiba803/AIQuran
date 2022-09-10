package com.example.quranapp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ayahs extends AppCompatActivity {
    TextView Name;
    RecyclerView rc;
    ArrayList<TransaltionModel> data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int SurahNo = intent.getIntExtra("SurahNum",0);
        String lang = intent.getStringExtra("Required");
        String SurahName = intent.getStringExtra("SurahName");
        String translator = intent.getStringExtra("Translator");

        Name = findViewById(R.id.SuraNametxt);
        rc = findViewById(R.id.myRC);

        Name.setText(SurahName);
        ArrayList<DBModel> list = new ArrayList<>();
        DBHelper db = new DBHelper(this);
        list = db.getData(SurahNo);

        for(int i=0;i < list.size();i++) {
            if (translator == "Fateh_Muhammad_Jalandhri")
            {
                data.add(new TransaltionModel(list.get(i).ArabicText, list.get(i).Fateh_Muhammad_Jalandhri));
            }
            else if (translator == "mehmood_ul_hassan")
            {
                data.add(new TransaltionModel(list.get(i).ArabicText, list.get(i).Mehmood_ul_Hassan));
            }
            else if (translator == "Dr_Mohsin_Khan")
            {
                data.add(new TransaltionModel(list.get(i).ArabicText, list.get(i).Dr_Mohsin_Khan));
            }
            else if (translator == "Mufti_Taqi_Usmani")
            {
                data.add(new TransaltionModel(list.get(i).ArabicText, list.get(i).Mufti_Taqi_Usmani));
            }
        }
        mySurahTextAdapter adapter = new mySurahTextAdapter(lang);
        rc.setAdapter(adapter);

        rc.setLayoutManager(new LinearLayoutManager(this));
        adapter.setData(data);

    }
}
