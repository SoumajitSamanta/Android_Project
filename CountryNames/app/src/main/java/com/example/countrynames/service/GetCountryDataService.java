package com.example.countrynames.service;

import com.example.countrynames.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {

    @GET("countries")
    Call<Result> getResult();
}
