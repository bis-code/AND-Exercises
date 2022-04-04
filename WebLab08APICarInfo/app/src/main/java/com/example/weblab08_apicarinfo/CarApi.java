package com.example.weblab08_apicarinfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CarApi {
    @GET("api/v3/dmr/regnrquery/{regNum}")
    Call<CarResponse> getCar(@Path("regNum") String regNum);
}
