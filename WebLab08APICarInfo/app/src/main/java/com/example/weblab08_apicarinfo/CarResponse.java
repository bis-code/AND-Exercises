package com.example.weblab08_apicarinfo;

import com.google.gson.annotations.SerializedName;

public class CarResponse {
    private String regNumber;
    private String vinNumber;
    private String status;
    private String statusDate;
    private boolean leasing;
    private String leasingFrom;
    private String leasingUntil;
    private String carModel;
    private String carType;
    private String carVariantType;
    private String kmPerLiter;
    private String engineVolume;
    private String engineKilometers;

    public Car getCar() {
        return new Car(regNumber, vinNumber, status, statusDate, leasing, leasingFrom, leasingUntil, carModel, carType, carVariantType, kmPerLiter, engineVolume, engineKilometers);
    }
}
