package com.example.weblab08_apicarinfo;

import com.google.gson.annotations.SerializedName;

public class Car {
    @SerializedName("regNr")
    private String regNumber;
    @SerializedName("stelNr")
    private String vinNumber;
    @SerializedName("status")
    private String status;
    @SerializedName("statusDato")
    private String statusDate;
    @SerializedName("bilLeaset")
    private boolean leasing;
    @SerializedName("leasingGyldigFra")
    private String leasingFrom;
    @SerializedName("leasingGyldigTil")
    private String leasingUntil;
    @SerializedName("maerkeTypeNavn")
    private String carModel;
    @SerializedName("modelTypeNavn")
    private String carType;
    @SerializedName("variantTypeNavn")
    private String carVariantType;
    @SerializedName("motorKmPerLiter")
    private String kmPerLiter;
    @SerializedName("motorSlagVolumen")
    private String engineVolume;
    @SerializedName("motorKilometerstand")
    private String engineKilometers;


    public Car(String regNumber, String vinNumber, String status, String statusDate, boolean leasing, String leasingFrom, String leasingUntil, String carModel, String carType, String carVariantType, String kmPerLiter, String engineVolume, String engineKilometers) {
        this.regNumber = regNumber;
        this.vinNumber = vinNumber;
        this.status = status;
        this.statusDate = statusDate;
        this.leasing = leasing;
        this.leasingFrom = leasingFrom;
        this.leasingUntil = leasingUntil;
        this.carModel = carModel;
        this.carType = carType;
        this.carVariantType = carVariantType;
        this.kmPerLiter = kmPerLiter;
        this.engineVolume = engineVolume;
        this.engineKilometers = engineKilometers;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public boolean isLeasing() {
        return leasing;
    }

    public void setLeasing(boolean leasing) {
        this.leasing = leasing;
    }

    public String isLeasingFrom() {
        return leasingFrom;
    }

    public void setLeasingFrom(String leasingFrom) {
        this.leasingFrom = leasingFrom;
    }

    public String isLeasingUntil() {
        return leasingUntil;
    }

    public void setLeasingUntil(String leasingUntil) {
        this.leasingUntil = leasingUntil;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarVariantType() {
        return carVariantType;
    }

    public void setCarVariantType(String carVariantType) {
        this.carVariantType = carVariantType;
    }

    public String getKmPerLiter() {
        return kmPerLiter;
    }

    public void setKmPerLiter(String kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getEngineKilometers() {
        return engineKilometers;
    }

    public void setEngineKilometers(String engineKilometers) {
        this.engineKilometers = engineKilometers;
    }
}
