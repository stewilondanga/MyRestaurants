package io.github.stewilondanga.myrestaurants.services;

import javax.security.auth.callback.Callback;
import io.github.stewilondanga.myrestaurants.Constants;
import io.github.stewilondanga.myrestaurants.models.Restaurant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by stewart on 6/10/18.
 */

public class YelpService {
    private static OkHttpClient client = new OkHttpClient();

    private static void findRestaurants(String location, okhttp3.Callback callback) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.YELP_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.YELP_LOCATION_QUERY, location);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .header("Authorization", "Bearer " + Constants.API_KEY)
                .url(url)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public List<Restaurants> processResults(Response response) {
        List<Restaurants> restaurants = new ArrayList<>();

            try {
                String jsonData = response.body().string;

                if (response.isSuccessful()) {
                    //The response JSON is an array of business objects within an object so we need to get that array
                    JSONObject yelpJSON = new JSONObject(jsonData);
                    JSONArray businessesJSON = yelpJSON.getJSONArray("businesses");

                    Type collectionType = new TypeToken<List< Restaurants >> () {}.getType();
                    Gson gson = new GsonBuilder().create();
                    restaurants = gson.fromJson(businessesJSON.toString(), collectionType);
                }
            } catch(JSONException | NullPointerException | IOException e) {
                    e.printStackTrace();
        }

            return restaurants;
    }
}




