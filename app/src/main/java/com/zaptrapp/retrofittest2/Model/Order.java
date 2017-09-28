package com.zaptrapp.retrofittest2.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nishanth on 28/09/17.
 */

public class Order {

    @SerializedName("id")
    public int id;
    @SerializedName("parent_id")
    public int parent_id;
    @SerializedName("number")
    public String number;
    @SerializedName("order_key")
    public String order_key;
    @SerializedName("created_via")
    public String created_via;
    @SerializedName("version")
    public String version;
    @SerializedName("status")
    public String status;
    @SerializedName("currency")
    public String currency;
    @SerializedName("date_created")
    public String date_created;
    @SerializedName("date_created_gmt")
    public String date_created_gmt;
    @SerializedName("date_modified")
    public String date_modified;
    @SerializedName("date_modified_gmt")
    public String date_modified_gmt;
    @SerializedName("discount_total")
    public String discount_total;
    @SerializedName("discount_tax")
    public String discount_tax;
    @SerializedName("shipping_total")
    public String shipping_total;
    @SerializedName("shipping_tax")
    public String shipping_tax;
    @SerializedName("cart_tax")
    public String cart_tax;
    @SerializedName("total")
    public String total;
    @SerializedName("total_tax")
    public String total_tax;
    @SerializedName("prices_include_tax")
    public boolean prices_include_tax;
    @SerializedName("customer_id")
    public int customer_id;
    @SerializedName("customer_ip_address")
    public String customer_ip_address;
    @SerializedName("customer_user_agent")
    public String customer_user_agent;
    @SerializedName("customer_note")
    public String customer_note;
    @SerializedName("billing")
    public Billing billing;
    @SerializedName("shipping")
    public Shipping shipping;
    @SerializedName("payment_method")
    public String payment_method;
    @SerializedName("payment_method_title")
    public String payment_method_title;
    @SerializedName("transaction_id")
    public String transaction_id;
    @SerializedName("date_paid")
    public String date_paid;
    @SerializedName("date_paid_gmt")
    public String date_paid_gmt;
    @SerializedName("date_completed")
    public String date_completed;
    @SerializedName("date_completed_gmt")
    public String date_completed_gmt;
    @SerializedName("cart_hash")
    public String cart_hash;
    @SerializedName("meta_data")
    public List<Meta_data> meta_data;
    @SerializedName("line_items")
    public List<Line_items> line_items;
    @SerializedName("tax_lines")
    public List<Tax_lines> tax_lines;
    @SerializedName("shipping_lines")
    public List<Shipping_lines> shipping_lines;
    @SerializedName("fee_lines")
    public List<Fee_lines> fee_lines;
    @SerializedName("coupon_lines")
    public List<Coupon_lines> coupon_lines;
    @SerializedName("refunds")
    public List<Refunds> refunds;
    @SerializedName("_links")
    public _links _links;

    public static class Billing {
        @SerializedName("first_name")
        public String first_name;
        @SerializedName("last_name")
        public String last_name;
        @SerializedName("company")
        public String company;
        @SerializedName("address_1")
        public String address_1;
        @SerializedName("address_2")
        public String address_2;
        @SerializedName("city")
        public String city;
        @SerializedName("state")
        public String state;
        @SerializedName("postcode")
        public String postcode;
        @SerializedName("country")
        public String country;
        @SerializedName("email")
        public String email;
        @SerializedName("phone")
        public String phone;
    }

    public static class Shipping {
        @SerializedName("first_name")
        public String first_name;
        @SerializedName("last_name")
        public String last_name;
        @SerializedName("company")
        public String company;
        @SerializedName("address_1")
        public String address_1;
        @SerializedName("address_2")
        public String address_2;
        @SerializedName("city")
        public String city;
        @SerializedName("state")
        public String state;
        @SerializedName("postcode")
        public String postcode;
        @SerializedName("country")
        public String country;
    }

    public static class Meta_data {
    }

    public static class Line_items {
    }

    public static class Tax_lines {
    }

    public static class Shipping_lines {
    }

    public static class Fee_lines {
    }

    public static class Coupon_lines {
    }

    public static class Refunds {
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
