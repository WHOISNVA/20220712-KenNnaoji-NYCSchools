package com.dapperartisancompany.a20220712_kennnaoji_nycschools;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    //decided to use the api that contains both the names and the scores
    String BASE_URL = "https://data.cityofnewyork.us/resource/";
    @GET("f9bf-2cp4.json")
    Call<List<Results>> getSchoolData();
}
