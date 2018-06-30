package io.github.stewilondanga.myrestaurants.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.github.stewilondanga.myrestaurants.models.Restaurant;
import io.github.stewilondanga.myrestaurants.ui.RestaurantDetailFragment;

import java.util.ArrayList;

/**
 * Created by stewart on 6/20/18.
 */

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Restaurant> mRestaurants;
    private String mSource;

    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants, String source) {
        super(fm);
        mRestaurants = restaurants;
        mSource = source;
    }

    @Override
    public Fragment getItem(int position) {
        return RestaurantDetailFragment.newInstance(mRestaurants, position, mSource);
    }

    @Override
    public int getCount() {

        return mRestaurants.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mRestaurants.get(position).getName();
    }
}
