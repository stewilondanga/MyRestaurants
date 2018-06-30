package io.github.stewilondanga.myrestaurants.util;

import io.github.stewilondanga.myrestaurants.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by stewart on 6/30/18.
 */

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);
}
