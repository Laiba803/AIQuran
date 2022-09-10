package com.example.quranapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SurahNames extends AppCompatActivity {
    RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surah_urdu);
        rc = findViewById(R.id.URecyclerView);


    }
}