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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
//        OAuthParameters oAuthParameters = setupOAuth();
        ApiInterface apiInterface =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Product> product = apiInterface.getProduct(42);
        product.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                Log.d("Product Name", response.body().name);
                textView.setText(response.body().name);
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.d("Failure", "Try Again");
                Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();

            }
        });

        Call<List<Product>> productList = apiInterface.getProductsList();
        productList.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                Toast.makeText(MainActivity.this, "Product List", Toast.LENGTH_SHORT).show();
                textView.append("Total Product List: "+response.body().);
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
    }


    // http://sowdambiga.dev/wp-json/wc/v2/products/42?oauth_consumer_key=ck_355800487551d5f484f2900d93848f1b86c64cfe
    // &oauth_signature_method=HMAC-SHA1
    // &oauth_timestamp=1506501864
    // &oauth_nonce=RsnTixI1gym
    // &oauth_version=1.0
    // &oauth_signature=0KTa50O2PJ+4grvLJehVGCZg8ag=

//    private OAuthParameters setupOAuth() {
//        OAuthParameters oAuthParameters = new OAuthParameters();
////        oAuthParameters.computeTimestamp();
////        oAuthParameters.computeNonce();
//        oAuthParameters.timestamp = "1506501864";
//        oAuthParameters.nonce = "RsnTixI1gym";
//        oAuthParameters.version = "1.0";
//        oAuthParameters.consumerKey = ApiClient.consumerKey;
//        oAuthParameters.signatureMethod="HMAC-SHA1";
//
//        OAuthHmacSigner oAuthHmacSigner = new OAuthHmacSigner();
//        oAuthHmacSigner.clientSharedSecret = ApiClient.consumerSecret;
//        oAuthParameters.signer = oAuthHmacSigner;
//
//        return oAuthParameters;
//
//    }


}
