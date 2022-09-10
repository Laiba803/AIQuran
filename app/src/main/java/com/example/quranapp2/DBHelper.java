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
import java.util.List;

public class DBHelper extends SQLiteAssetHelper {
    public static final String DBNAME = "quran_database.db";
    public static final int DBVERSION = 1;
    public static final String TNAME = "tayah";

    public DBHelper(Context context) {
        super(context,DBNAME,null,DBVERSION);
    }

    public ArrayList<DBModel> getData(int Suranum) {
        SQLiteDatabase db= this.getReadableDatabase();
        ArrayList<DBModel> data = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TNAME + " WHERE SuraID = '" + Suranum + "'", null );
        if(cursor.moveToFirst()){
            do{
                data.add(new DBModel(
                        cursor.getInt(0),
                        cursor.getInt(1),
                        cursor.getInt(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7),
                        cursor.getInt(8),
                        cursor.getInt(9),
                        cursor.getInt(10)
                ));
            }while (cursor.moveToNext());
        }
        cursor.close();
        return data;
    }
}
