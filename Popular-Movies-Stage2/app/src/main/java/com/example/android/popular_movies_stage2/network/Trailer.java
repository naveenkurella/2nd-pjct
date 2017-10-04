package com.example.android.popular_movies_stage2.network;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nkurella on 29-09-2017.
 */

public class Trailer implements Parcelable{

    @SerializedName("id")
    private String mId;
    @SerializedName("key")
    private String mKey;
    @SerializedName("name")
    private String mName;
    @SerializedName("site")
    private String mSite;
    @SerializedName("size")
    private String mSize;

    // Only for createFromParcel
    private Trailer() {
    }

    public String getName() {
        return mName;
    }

    public String getKey() {
        return mKey;
    }

    public String getTrailerUrl() {
        return "http://www.youtube.com/watch?v=" + mKey;
    }

    public static final Parcelable.Creator<Trailer> CREATOR = new Creator<Trailer>() {
        public Trailer createFromParcel(Parcel source) {
            Trailer trailer = new Trailer();
            trailer.mId = source.readString();
            trailer.mKey = source.readString();
            trailer.mName = source.readString();
            trailer.mSite = source.readString();
            trailer.mSize = source.readString();
            return trailer;
        }

        public Trailer[] newArray(int size) {
            return new Trailer[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(mId);
        parcel.writeString(mKey);
        parcel.writeString(mName);
        parcel.writeString(mSite);
        parcel.writeString(mSize);
    }
}
