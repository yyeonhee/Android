package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Entity {
    @GET("v2/local/search/category.json")
    Call<Category> getSearch(
            @Header("Authorization") String token,
            @Query("category_group_code") String category_group_code,
            @Query("x") String x,
            @Query("y") String y,
            @Query("radius") int radius
    );
}


