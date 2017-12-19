package fr.android.androidexercises;

import android.app.Application;

import retrofit2.Retrofit;

/**
 * Created by Manon on 19/12/2017.
 */

public class MyApp extends Application {

    public static HenriPotierService service;

    @Override
    public void onCreate() {
        super.onCreate();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://henri")
    }
}
