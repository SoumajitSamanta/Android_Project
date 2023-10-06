package com.example.demoapi.service;

import com.example.demoapi.model.Id;
import com.example.demoapi.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {

    @GET("/api/")
    Call<Id> getName();
}