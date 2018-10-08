package com.example.pratik.arraylistproblem;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface{
    @GET("dummy") //Your end point is here
    Call<PlaceDetails> getDescriptions();
}
