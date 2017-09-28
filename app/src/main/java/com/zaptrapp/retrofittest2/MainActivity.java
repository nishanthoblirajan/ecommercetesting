package com.zaptrapp.retrofittest2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.zaptrapp.retrofittest2.APIClient.ApiClient;
import com.zaptrapp.retrofittest2.APIClient.ApiInterface;
import com.zaptrapp.retrofittest2.Model.ProductReview;

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


        //////WORKING/////
//        Call<Product> product = apiInterface.getProduct(42);
//        product.enqueue(new Callback<Product>() {
//            @Override
//            public void onResponse(Call<Product> call, Response<Product> response) {
//                if(response.isSuccessful()) {
//                    Log.d("Product Name", response.body().name);
//                    textView.setText(response.body().name);
//                }else{
//                    textView.setText(response.code()+"");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Product> call, Throwable t) {
//                Log.d("onFailure",t.toString());
//                textView.setText("Cannot Retrieve Details");
//            }
//        });
//
//        Call<List<Product>> productsList = apiInterface.getProductsList();
//        productsList.enqueue(new Callback<List<Product>>() {
//            @Override
//            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
//                Toast.makeText(MainActivity.this, response.body().toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<List<Product>> call, Throwable t) {
//                Log.d("onFailure",t.toString());
//            }
//        });


//        Category category = new Category();
//        category.name = "new Category";
//        category.image = new Category.Image();
//        category.image.src = "http://dc7dbea4.ngrok.io/wp-content/uploads/2017/09/T_2_front.jpg";
//        Call<Category> createCategory = apiInterface.createCategory(category);
//        createCategory.enqueue(new Callback<Category>() {
//            @Override
//            public void onResponse(Call<Category> call, Response<Category> response) {
//                Toast.makeText(MainActivity.this, "Created", Toast.LENGTH_SHORT).show();
//                Log.d("Category Create","Created");
//            }
//
//            @Override
//            public void onFailure(Call<Category> call, Throwable t) {
//                Log.d("Category Create","Failed");
//                Log.d("Category Create",t.toString());
//            }
//        });

        Call<List<ProductReview>> productReviewCall = apiInterface.getProductReviews(34);
        productReviewCall.enqueue(new Callback<List<ProductReview>>() {
            @Override
            public void onResponse(Call<List<ProductReview>> call, Response<List<ProductReview>> response) {
                Log.d("Review","Successful");
            }

            @Override
            public void onFailure(Call<List<ProductReview>> call, Throwable t) {
                Log.d("Review","Unsuccessful");

            }
        });


    }






}
