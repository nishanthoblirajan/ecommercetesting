package com.zaptrapp.retrofittest2.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nishanth on 27/09/17.
 */

public class Product {

    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("slug")
    public String slug;
    @SerializedName("permalink")
    public String permalink;
    @SerializedName("date_created")
    public String date_created;
    @SerializedName("date_created_gmt")
    public String date_created_gmt;
    @SerializedName("date_modified")
    public String date_modified;
    @SerializedName("date_modified_gmt")
    public String date_modified_gmt;
    @SerializedName("type")
    public String type;
    @SerializedName("status")
    public String status;
    @SerializedName("featured")
    public boolean featured;
    @SerializedName("catalog_visibility")
    public String catalog_visibility;
    @SerializedName("description")
    public String description;
    @SerializedName("short_description")
    public String short_description;
    @SerializedName("sku")
    public String sku;
    @SerializedName("price")
    public String price;
    @SerializedName("regular_price")
    public String regular_price;
    @SerializedName("sale_price")
    public String sale_price;
    @SerializedName("date_on_sale_from")
    public String date_on_sale_from;
    @SerializedName("date_on_sale_from_gmt")
    public String date_on_sale_from_gmt;
    @SerializedName("date_on_sale_to")
    public String date_on_sale_to;
    @SerializedName("date_on_sale_to_gmt")
    public String date_on_sale_to_gmt;
    @SerializedName("price_html")
    public String price_html;
    @SerializedName("on_sale")
    public boolean on_sale;
    @SerializedName("purchasable")
    public boolean purchasable;
    @SerializedName("total_sales")
    public int total_sales;
    @SerializedName("virtual")
    public boolean virtual;
    @SerializedName("downloadable")
    public boolean downloadable;
    @SerializedName("downloads")
    public List<Downloads> downloads;
    @SerializedName("download_limit")
    public int download_limit;
    @SerializedName("download_expiry")
    public int download_expiry;
    @SerializedName("external_url")
    public String external_url;
    @SerializedName("button_text")
    public String button_text;
    @SerializedName("tax_status")
    public String tax_status;
    @SerializedName("tax_class")
    public String tax_class;
    @SerializedName("manage_stock")
    public boolean manage_stock;
    @SerializedName("stock_quantity")
    public String stock_quantity;
    @SerializedName("in_stock")
    public boolean in_stock;
    @SerializedName("backorders")
    public String backorders;
    @SerializedName("backorders_allowed")
    public boolean backorders_allowed;
    @SerializedName("backordered")
    public boolean backordered;
    @SerializedName("sold_individually")
    public boolean sold_individually;
    @SerializedName("weight")
    public String weight;
    @SerializedName("dimensions")
    public Dimensions dimensions;
    @SerializedName("shipping_required")
    public boolean shipping_required;
    @SerializedName("shipping_taxable")
    public boolean shipping_taxable;
    @SerializedName("shipping_class")
    public String shipping_class;
    @SerializedName("shipping_class_id")
    public int shipping_class_id;
    @SerializedName("reviews_allowed")
    public boolean reviews_allowed;
    @SerializedName("average_rating")
    public String average_rating;
    @SerializedName("rating_count")
    public int rating_count;
    @SerializedName("related_ids")
    public List<Integer> related_ids;
    @SerializedName("upsell_ids")
    public List<Upsell_ids> upsell_ids;
    @SerializedName("cross_sell_ids")
    public List<Cross_sell_ids> cross_sell_ids;
    @SerializedName("parent_id")
    public int parent_id;
    @SerializedName("purchase_note")
    public String purchase_note;
    @SerializedName("categories")
    public List<Categories> categories;
    @SerializedName("tags")
    public List<Tags> tags;
    @SerializedName("images")
    public List<Images> images;
    @SerializedName("attributes")
    public List<Attributes> attributes;
    @SerializedName("default_attributes")
    public List<Default_attributes> default_attributes;
    @SerializedName("variations")
    public List<Variations> variations;
    @SerializedName("grouped_products")
    public List<Grouped_products> grouped_products;
    @SerializedName("menu_order")
    public int menu_order;
    @SerializedName("meta_data")
    public List<Meta_data> meta_data;
    @SerializedName("_links")
    public _links _links;

    public static class Downloads {
    }

    public static class Dimensions {
        @SerializedName("length")
        public String length;
        @SerializedName("width")
        public String width;
        @SerializedName("height")
        public String height;
    }

    public static class Upsell_ids {
    }

    public static class Cross_sell_ids {
    }

    public static class Categories {
        @SerializedName("id")
        public int id;
        @SerializedName("name")
        public String name;
        @SerializedName("slug")
        public String slug;
    }

    public static class Tags {
    }

    public static class Images {
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
        @SerializedName("name")
        public String name;
        @SerializedName("alt")
        public String alt;
        @SerializedName("position")
        public int position;
    }

    public static class Attributes {
    }

    public static class Default_attributes {
    }

    public static class Variations {
    }

    public static class Grouped_products {
    }

    public static class Meta_data {
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
