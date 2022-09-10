package com.example.quranapp2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
public class DBHelper extends SQLiteAssetHelper {
    public static final String DBNAME = "quran_database.db";
    public static final int DBVERSION = 1;
    public static final String TNAME = "tayah";

    public DBHelper(Context context) {
        super(context,DBNAME,null,DBVERSION);
    }

    public ArrayList<DBModel> getData(String ColName,int Suranum) {
        SQLiteDatabase db= this.getReadableDatabase();

    }
}
