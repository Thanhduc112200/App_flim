package com.example.btl_app_movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Film {
    private int filmId;
    private String FilmName;
    private String Director;
    private String Genre;
    private int Time;
    private String Language;
    private int PremiereDate;
    private String ImgUrl;

    public Film() {
    }

//    public Film(int filmId, String filmName, String director, String genre, int time, String language, int premiereDate, String imgUrl) {
//        this.filmId = filmId;
//        FilmName = filmName;
//        Director = director;
//        Genre = genre;
//        Time = time;
//        Language = language;
//        PremiereDate = premiereDate;
//
//        ImgUrl = imgUrl;
//    }

    public Film(String filmName, String director, String genre, int time, String language, int premiereDate, String imgUrl)  {
        FilmName = filmName;
        Director = director;
        Genre = genre;
        Time = time;
        Language = language;
        PremiereDate = premiereDate;

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

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public int getPremiereDate() {
        return PremiereDate;
    }

    public void setPremiereDate(int premiereDate) {
        PremiereDate = premiereDate;
    }
}

