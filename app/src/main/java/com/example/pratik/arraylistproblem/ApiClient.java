package com.example.pratik.arraylistproblem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient{
    private static final String BASE_URL = "https://gist.githubusercontent.com/exploringpratik/baf405fe786fdbf46cc20b8cd2079566/raw/95b0e50b9c96c291629723b32654752aa1c15adf/";
    private static Retrofit retrofit = null;

    public static Retrofit getApiClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if (retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create(gson)).
                    build();
        return retrofit;
    }
}
