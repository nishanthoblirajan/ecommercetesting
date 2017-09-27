package com.zaptrapp.retrofittest2.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nishanth on 27/09/17.
 */

public class ProductReview {


    @SerializedName("id")
    public int id;
    @SerializedName("date_created")
    public String date_created;
    @SerializedName("date_created_gmt")
    public String date_created_gmt;
    @SerializedName("review")
    public String review;
    @SerializedName("rating")
    public int rating;
    @SerializedName("name")
    public String name;
    @SerializedName("email")
    public String email;
    @SerializedName("verified")
    public boolean verified;
    @SerializedName("_links")
    public _links _links;

    public static class Self {
        @SerializedName("href")
        public String href;
    }

    public static class Collection {
        @SerializedName("href")
        public String href;
    }

    public static class Up {
        @SerializedName("href")
        public String href;
    }

    public static class _links {
        @SerializedName("self")
        public List<Self> self;
        @SerializedName("collection")
        public List<Collection> collection;
        @SerializedName("up")
        public List<Up> up;
    }
}
