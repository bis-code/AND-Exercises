package com.example.weblab08_apicarinfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class CarViewModel extends ViewModel {
    CarRepository repository;

    public CarViewModel() {
        repository = CarRepository.getInstance();
    }

    LiveData<Car> getSearchedCar() {
        return repository.getSearchedCar();
    }

    public void searchForCar(String regNum) {
        repository.searchForCar(regNum);
    }
}
