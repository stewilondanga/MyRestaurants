package io.github.stewilondanga.myrestaurants;

/**
 * Created by stewart on 6/10/18.
 */

public class Constants {
    public static final String API_KEY = BuildConfig.API_KEY;
    public static final String YELP_BASE_URL = "https://api.yelp.com/v3/businesses/search";
    public static final String YELP_LOCATION_QUERY = "location";
    //public static final String PREFERENCES_LOCATION_KEY = "location";
    public static final String FIREBASE_CHILD_SEARCHED_LOCATION = "searchedLocation";
    public static final String FIREBASE_CHILD_RESTAURANTS = "restaurants";
    public static final String FIREBASE_QUERY_INDEX = "index";
    public static final String EXTRA_KEY_POSITION = "position";
    public static final String EXTRA_KEY_RESTAURANTS = "restaurants";
    public static final String KEY_SOURCE = "source";
    public static final String SOURCE_SAVED = "saved";
    public static final String SOURCE_FIND = "find";
}
