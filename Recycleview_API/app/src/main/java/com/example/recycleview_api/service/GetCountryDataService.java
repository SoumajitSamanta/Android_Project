package com.example.recycleview_api.service;

import com.example.recycleview_api.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {

    @GET("countries")
    Call<Result> getResult();
}
