package com.zaptrapp.retrofittest2.APIClient;

import com.zaptrapp.retrofittest2.Model.Category;
import com.zaptrapp.retrofittest2.Model.Product;
import com.zaptrapp.retrofittest2.Model.ProductReview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;



public interface ApiInterface {

    @GET("/wp-json/wc/v2/products/{id}")
    Call<Product> getProduct(@Path("id") int id);


    @GET("/wp-json/wc/v2/products")
    Call<List<Product>> getProductsList();

    @GET("/wp-json/wc/v2/products/{id}/reviews")
    Call<List<ProductReview>> getProductReviews(@Path("id") int id);


    @GET("/wp-json/wc/v2/products/categories/{id}")
    Call<Category> getCategory(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @POST("/wp-json/wc/v2/products/categories")
    Call<Category> createCategory(@Body Category category);



}
