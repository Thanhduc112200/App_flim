package com.example.btl_app_movie.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.btl_app_movie.DBHandler;
import com.example.btl_app_movie.Film;
import com.example.btl_app_movie.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler handler = new DBHandler(MainActivity.this);
        Film film =new Film("conan","gosu","trinh tham",110,"english",2023,"drawable/anhfilm1.jpg");
        handler.AddFilm(film);
    }
}