package com.zaptrapp.retrofittest2.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nishanth on 28/09/17.
 */

public class Category {

    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("slug")
    public String slug;
    @SerializedName("parent")
    public int parent;
    @SerializedName("description")
    public String description;
    @SerializedName("display")
    public String display;
    @SerializedName("image")
    public Image image;
    @SerializedName("menu_order")
    public int menu_order;
    @SerializedName("count")
    public int count;
    @SerializedName("_links")
    public _links _links;

    public static class Image {
        @SerializedName("id")
        public int id;
        @SerializedName("date_created")
        public String date_created;
        @SerializedName("date_created_gmt")
        public String date_created_gmt;
        @SerializedName("date_modified")
        public String date_modified;
        @SerializedName("date_modified_gmt")
        public String date_modified_gmt;
        @SerializedName("src")
        public String src;
        @SerializedName("title")
        public String title;
        @SerializedName("alt")
        public String alt;
    }

    public static class Self {
        @SerializedName("href")
        public String href;
    }

    public static class Collection {
        @SerializedName("href")
        public String href;
    }

    public static class _links {
        @SerializedName("self")
        public List<Self> self;
        @SerializedName("collection")
        public List<Collection> collection;
    }


}
