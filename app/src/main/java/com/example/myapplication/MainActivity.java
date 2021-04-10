package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements inter {
    List<Documents> getList = new ArrayList<>();
    RecyclerView recyclerView;
    Rvadapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true);

        Entity entity = MakeRetrofit.getRetrofit().create(Entity.class);
        Call<Category> call = entity.getSearch("KakaoAK dbf71114f3f7aa351fb9d82c481e911b", "CS2","126.9349","36.7691",2000);
        call.enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                if (response.isSuccessful()) {
                    getList = response.body().getList();
                    onSuccess(getList);
                }
            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) {
            }
        });
    }
    @Override
    public void onSuccess(List<Documents> getList) {
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new Rvadapter((ArrayList<Documents>) getList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}