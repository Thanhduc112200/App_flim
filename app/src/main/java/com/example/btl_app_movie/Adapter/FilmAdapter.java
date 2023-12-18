package com.example.btl_app_movie.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btl_app_movie.Activity.DetailActivity;
import com.example.btl_app_movie.Film;
import com.example.btl_app_movie.R;
import com.example.btl_app_movie.databinding.ItemFilmBinding;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmviewHolder>{
    Context context;
    ArrayList<Film> films;

    public FilmAdapter(Context context, ArrayList<Film> films) {
        this.context = context;
        this.films = films;
    }

    @NonNull
    @Override
    public FilmviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent,false);
        return new FilmviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmviewHolder holder, int position) {
        Film f = films.get(position);
        holder.binding.tvTitle.setText(f.getFilmName());
        holder.binding.tvTime.setText(f.getTime());
        Bitmap imageContent = BitmapFactory.decodeByteArray(f.getImage(), 0, f.getImage().length);
        holder.binding.pic.setImageBitmap(imageContent);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("id", f.getFilmId());
                intent.putExtra("title", f.getFilmName());
                intent.putExtra("img", f.getImage());
                intent.putExtra("time", f.getTime());
                intent.putExtra("tacgia", f.getTacGia());
                intent.putExtra("url", f.getImgUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public class FilmviewHolder extends RecyclerView.ViewHolder{
        ItemFilmBinding binding;
        public FilmviewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemFilmBinding.bind(itemView);
        }

    }
}
