package com.example.weblab08_apicarinfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CarApi {
    @GET("noapiimplemented")
    Call<CarResponse> getCar(@Path("regNum") String regNum);
}
