package com.example.btl_app_movie;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    public DBHandler(@Nullable Context context) {
        super(context, "datamovie.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public ArrayList<Film> getAllFilm() {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT film.* FROM film";
        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }
        if (cursor == null) {
            return null;
        } else {
            ArrayList<Film> films = new ArrayList<>();
            while (cursor.moveToNext()) {
                int id = cursor.getInt(0);
                String Name = cursor.getString(1);
                String category = cursor.getString(2);
                String time = cursor.getString(3);
                String tacgia = cursor.getString(4);
                byte[] imageContent = cursor.getBlob(5);
                String url = cursor.getString(6);
                Film f = new Film(Name,category,time,tacgia,url);
                f.setImage(imageContent);
                f.setFilmId(id);
                films.add(f);
            }
            return films;
        }
    }
}
