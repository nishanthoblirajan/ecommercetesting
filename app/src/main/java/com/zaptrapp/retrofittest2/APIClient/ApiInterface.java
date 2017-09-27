package com.zaptrapp.retrofittest2.APIClient;

import com.zaptrapp.retrofittest2.Product;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by nishanth on 26/09/17.
 */

public interface ApiInterface {


    // http://sowdambiga.dev/wp-json/wc/v2/products/42?oauth_consumer_key=ck_355800487551d5f484f2900d93848f1b86c64cfe
    // &oauth_signature_method=HMAC-SHA1
    // &oauth_timestamp=1506501864
    // &oauth_nonce=RsnTixI1gym
    // &oauth_version=1.0
    // &oauth_signature=0KTa50O2PJ+4grvLJehVGCZg8ag=
    @GET("/wp-json/wc/v2/products/{id}")
    Call<Product> getProduct(@Path("id") int id);




}
