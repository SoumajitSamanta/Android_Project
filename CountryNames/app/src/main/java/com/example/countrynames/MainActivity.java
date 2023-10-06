package com.example.countrynames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.countrynames.model.Countrymodel;
import com.example.countrynames.model.Result;
import com.example.countrynames.service.GetCountryDataService;
import com.example.countrynames.service.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Countrymodel>countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getcountries();
    }
    public Object getcountries(){
        GetCountryDataService getCountryDataService= RetrofitInstance.getCountryDataService();
        Call<Result> call = getCountryDataService.getResult();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();
                    if(result !=null && result.getResult() !=null){
                        countries = (ArrayList<Countrymodel>) result.getResult();

                        for (Countrymodel c:countries){
                            Log.i("TAG",""+c.getName());
                        }
                    }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

        return  0;
    }
}