package com.firehook.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.firehook.retrofit.API;
import com.firehook.retrofit.ApiClient;
import com.firehook.retrofit.modelCategories.Item;
import com.firehook.retrofit.modelCategories.Quiz;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    List<Item> itemList = null;
    List<Category> categoryList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        itemList = new ArrayList<Item>();
        categoryList = new ArrayList<Category>();

        //Intent intent = new Intent(this, RecyclerQuizActivity.class);
        //startActivity(intent);

        if(isDatabaseEmpty()){
            SetDataBase();
        }

    }

    private void SetDataBase(){
        final API apiService = ApiClient.getClient().create(API.class);
        Call<Quiz> quiz = apiService.getQuiz();
        quiz.enqueue(new Callback<Quiz>() {
            @Override
            public void onResponse(Call<Quiz> call, Response<Quiz> response) {
                Log.d("RETROFIT", " * * * * * onResponse");

                Quiz body = response.body();
                itemList = body.getItems();
                for (Item m : itemList){
                    Category c = new Category();
                    c.setTitle(m.getTitle());
                    c.setImageUrl(m.getMainPhoto().getUrl());
                    c.setLastResult("0");
                    c.setProgress(55);
                    categoryList.add(c);
                }
            }

            @Override
            public void onFailure(Call<Quiz> call, Throwable t) {
                Log.d("RETROFIT", "onFailure " + t.getMessage());
            }
        });
    }

    private boolean isDatabaseEmpty(){
        //TODO
        return true;
    }
}