package com.example.weblab08_apicarinfo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class CarRepository {
    private static CarRepository instance;
    private final MutableLiveData<Car> searchedCar;

    private CarRepository()
    {
        searchedCar = new MutableLiveData<>();
    }

    public static synchronized CarRepository getInstance()
    {
        if(instance == null)
        {
            instance = new CarRepository();
        }
        return instance;
    }

    public MutableLiveData<Car> getSearchedCar() {
        return searchedCar;
    }

    public void searchForCar(String regNum)
    {
        //if it was api
//        CarApi carApi = ServiceGenerator.getCarApi();
//        Call<CarResponse> call = carApi.getCar(regNum);
//        call.enqueue(new Callback<CarResponse>() {
//            @EverythingIsNonNull
//            @Override
//            public void onResponse(Call<CarResponse> call, Response<CarResponse> response) {
//                if(response.isSuccessful())
//                {
//                    searchedCar.setValue(response.body().getCar());
//                }
//            }
//
//            @EverythingIsNonNull
//            @Override
//            public void onFailure(Call<CarResponse> call, Throwable t) {
//                Log.i("Retrofit","Something went wrong :(");
//            }
//        });
        Car car = new Car("DA12345",
                "VAXSAD231FDFJ245",
                "Registered",
                "07-04-2022",
                false,
                "",
                "",
                "Peugeot",
                "Hatchback",
                "1.6 S-LINE",
                "166.000",
                "1600",
                "166.000");
        searchedCar.setValue(car);
    }
}
