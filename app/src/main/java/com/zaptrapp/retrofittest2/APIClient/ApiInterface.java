package com.zaptrapp.retrofittest2.APIClient;

import com.zaptrapp.retrofittest2.Model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by nishanth on 26/09/17.
 */

public interface ApiInterface {

    @GET("/wp-json/wc/v2/products/{id}")
    Call<Product> getProduct(@Path("id") int id);


    @GET("/wp-json/wc/v2/products")
    Call<List<Product>> getProductsList();




}
