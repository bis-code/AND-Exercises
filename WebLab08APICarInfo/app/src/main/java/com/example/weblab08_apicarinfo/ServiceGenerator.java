package com.example.weblab08_apicarinfo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static CarApi carApi;

    public static CarApi getCarApi()
    {
            carApi = new Retrofit.Builder().
                    baseUrl("https://www.tjekbil.dk").
                    addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(CarApi.class);
        return carApi;
    }
}
