package com.example.codelab06_mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<String> message = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoading = new MutableLiveData<>(false);
    public LiveData<String> getMessage() {
        return message;
    }

    public LiveData<Boolean> isLoading()
    {
        return isLoading;
    }

    public void retrieveData()
    {
        isLoading.setValue(true);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                message.postValue("HELLO FROM THE INTERNET");
                isLoading.postValue(false);
            }
        },3000);
    }
}
