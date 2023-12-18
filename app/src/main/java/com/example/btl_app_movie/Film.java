package com.example.btl_app_movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Film {
    int filmId;
    String FilmName;
    String Category;
    String Time;
    String TacGia;
    byte[] Image;
    String ImgUrl;

    public Film(String filmName, String category, String time, String tacGia, String imgUrl) {
        FilmName = filmName;
        Category = category;
        Time = time;
        TacGia = tacGia;
        ImgUrl = imgUrl;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return FilmName;
    }

    public void setFilmName(String filmName) {
        FilmName = filmName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }
}

