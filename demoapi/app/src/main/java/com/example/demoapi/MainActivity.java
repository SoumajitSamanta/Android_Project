package com.example.demoapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.demoapi.model.Id;
import com.example.demoapi.model.Result;
import com.example.demoapi.model.Result__1;
import com.example.demoapi.service.GetCountryDataService;
import com.example.demoapi.service.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<Result>countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public Object getcountries(){
        GetCountryDataService getCountryDataService= RetrofitInstance.getCountryDataService();
        Call<Id> call = getCountryDataService.getName();

        call.enqueue(new Callback<Id>() {
            @Override
            public void onResponse(Call<Id> call, Response<Id> response) {
                Id result = response.body();
                if(result !=null && result.getName() !=null){
                    countries = (ArrayList<Result>) result.getName();

                    for (Result c:countries){
                        Log.i("TAG",""+c.getName());
                    }
                }
            }

            @Override
            public void onFailure(Call<Id> call, Throwable t) {

            }
        });

        return  0;
    }
}