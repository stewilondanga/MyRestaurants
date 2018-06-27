package io.github.stewilondanga.myrestaurants.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.stewilondanga.myrestaurants.R;
import io.github.stewilondanga.myrestaurants.util.OnStartDragListener;


public class SavedRestaurantListActivity extends AppCompatActivity implements OnStartDragListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
    }
}