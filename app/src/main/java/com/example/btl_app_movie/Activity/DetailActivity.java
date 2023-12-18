package com.example.btl_app_movie.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.example.btl_app_movie.R;
import com.example.btl_app_movie.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int id = getIntent().getIntExtra("aaa",0);
        String title = getIntent().getStringExtra("title");
        String time = getIntent().getStringExtra("time");
        String tacgia = getIntent().getStringExtra("tacgia");
        String url = getIntent().getStringExtra("url");
        byte[] bytes = getIntent().getByteArrayExtra("img");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        binding.posterNormalImg.setImageBitmap(bitmap);
        binding.posterBigImg.setImageBitmap(bitmap);
        binding.movieName.setText(title);
        binding.movieTime.setText(time);
        binding.movieActorInfo.setText(tacgia);
    }
}