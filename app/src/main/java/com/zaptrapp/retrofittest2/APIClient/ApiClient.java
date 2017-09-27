package com.zaptrapp.retrofittest2.APIClient;

import com.zaptrapp.retrofittest2.Woocommerce.OAuthInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nishanth on 26/09/17.
 */


public class ApiClient {

    public static final String BASE_URL = "http://dc7dbea4.ngrok.io";
    private static Retrofit mRetrofit = null;
    public static final String consumerKey    = "ck_355800487551d5f484f2900d93848f1b86c64cfe"; //api key
    public static final String consumerSecret = "cs_22f0f1fe8e656004822a0a59414cb043e111c72a"; //api secret


    public static Retrofit getClient(){

        OAuthInterceptor oauth1Woocommerce = new OAuthInterceptor.Builder()
                .consumerKey(consumerKey)
                .consumerSecret(consumerSecret)
                .build();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .addInterceptor(oauth1Woocommerce)// Interceptor oauth1Woocommerce added
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return mRetrofit;
    }

}
