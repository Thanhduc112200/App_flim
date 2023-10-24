package com.example.btl_app_movie;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.btl_app_movie.Assets.SQLiteAssetHelper;

public class DBHandler extends SQLiteOpenHelper {
    private static  final  String DB_NAME = "appfilm";
    private static  final int DB_VERSION = 1;
    public DBHandler (Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    private  static final String CREATE_FILM_TABLE = "CREATE TABLE Film ("+
            "filmId INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "FilmName TEXT,"+
            "Director TEXT,"+
            "GenreId INTEGER,"+
            "Time INTEGER,"+
            "Language TEXT,"+
            "PremiereDate INTEGER,"+
            "ImgUrl TEXT,"+
            "FOREIGN KEY(GenreId) REFERENCES Genre(GenreId)"+
            ");";
    private  static final String CREATE_GENRE_TABLE = "CREATE TABLE Genre ("+
            "GenreId INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "GenreName  TEXT,"+
            "Description TEXT"+
            ");";

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_GENRE_TABLE);
        db.execSQL(CREATE_FILM_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Film");
        db.execSQL("DROP TABLE IF EXISTS Genre");
        onCreate(db);
    }
    public  void AddFilm(Film film){
        SQLiteDatabase database = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("FilmName",film.getFilmName());
        values.put("Director",film.getDirector());
        values.put("Genre",film.getGenre());
        values.put("Time",film.getTime());
        values.put("Language",film.getLanguage());
        values.put("PremiereDate", film.getPremiereDate());
        values.put("ImgUrl",film.getImgUrl());
        database.insert("Film",null,values);
    }
}
