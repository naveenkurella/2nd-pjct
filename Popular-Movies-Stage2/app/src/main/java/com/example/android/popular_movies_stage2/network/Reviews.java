package com.example.android.popular_movies_stage2.network;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nkurella on 29-09-2017.
 */

public class Reviews {
    @SerializedName("results")
    private List<Review> reviews = new ArrayList<>();

    public List<Review> getReviews() {
        return reviews;
    }
}
