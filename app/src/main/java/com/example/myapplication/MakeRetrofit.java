package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MakeRetrofit {
    private static final String URL ="https://dapi.kakao.com";
    private static Retrofit retrofit;

    public static  Retrofit getRetrofit() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
