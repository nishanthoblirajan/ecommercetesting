package com.zaptrapp.retrofittest2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.zaptrapp.retrofittest2.APIClient.ApiClient;
import com.zaptrapp.retrofittest2.APIClient.ApiInterface;
import com.zaptrapp.retrofittest2.Model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        //API
        ApiInterface apiInterface =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Product> product = apiInterface.getProduct(42);
        product.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                if(response.isSuccessful()) {
                    Log.d("Product Name", response.body().name);
                    textView.setText(response.body().name);
                }else{
                    textView.setText(response.code()+"");
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.d("onFailure",t.toString());
                textView.setText("Cannot Retrieve Details");
            }
        });

        Call<List<Product>> productsList = apiInterface.getProductsList();
        productsList.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                Toast.makeText(MainActivity.this, response.body().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.d("onFailure",t.toString());
            }
        });



    }






}
