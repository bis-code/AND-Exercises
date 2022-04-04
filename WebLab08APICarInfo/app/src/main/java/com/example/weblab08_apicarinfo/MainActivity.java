package com.example.weblab08_apicarinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private CarViewModel viewModel;
    private TextView regNumber;
    private TextView vinNumber;
    private TextView status;
    private TextView statusDate;
    private TextView carModel;
    private TextView carType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        regNumber = findViewById(R.id.regNumber);
        vinNumber = findViewById(R.id.vinNumber);
        status = findViewById(R.id.status);
        statusDate = findViewById(R.id.statusDate);
        carModel = findViewById(R.id.carModel);
        carType = findViewById(R.id.carType);

        viewModel = new ViewModelProvider(this).get(CarViewModel.class);
        viewModel.getSearchedCar().observe(this, car -> {
                regNumber.setText(car.getRegNumber());
                vinNumber.setText(car.getVinNumber());
                status.setText(car.getStatus());
                statusDate.setText(car.getStatusDate());
                carModel.setText(car.getCarModel());
                carType.setText(car.getCarType());
            });
    }

    public void searchForCar(View view) {
        viewModel.searchForCar(editText.getText().toString());
    }
}