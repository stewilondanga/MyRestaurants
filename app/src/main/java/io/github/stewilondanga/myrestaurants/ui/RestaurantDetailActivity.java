package io.github.stewilondanga.myrestaurants.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import io.github.stewilondanga.myrestaurants.R;
import io.github.stewilondanga.myrestaurants.services.YelpService;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class RestaurantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);
    }


    private void getRestaurants(String location) {
        final YelpService yelpService = new YelpService();
        yelpService.findRestaurants(location, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });
    }
}