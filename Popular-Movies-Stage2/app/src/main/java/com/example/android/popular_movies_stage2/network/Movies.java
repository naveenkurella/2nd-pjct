package com.example.android.popular_movies_stage2.network;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nkurella on 29-09-2017.
 */

public class Movies {

    /*SerializedName("results")
    private List<Movie> movies=new ArrayList<>();
public List<Movie> getmovies() { return movies; }*/

    @SerializedName("results")
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }
}
