package com.firehook.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.firehook.retrofit.API;
import com.firehook.retrofit.ApiClient;
import com.firehook.retrofit.modelAnswers.Answer;
import com.firehook.retrofit.modelAnswers.Question;
import com.firehook.retrofit.modelCategories.Item;
import com.firehook.retrofit.modelCategories.Quiz;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RecyclerQuizActivity extends Activity {

    RecyclerView mRecyclerView;
    List<Item> itemList = null;
    List<Category> categoryList = null;
    List<Question> questions = null;
    List<Answer> answers = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_quiz);

        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(llm);


        itemList = new ArrayList<Item>();
        categoryList = new ArrayList<Category>();

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
                AdapterRecycler ar = new AdapterRecycler(categoryList);
                mRecyclerView.setAdapter(ar);

            }

            @Override
            public void onFailure(Call<Quiz> call, Throwable t) {
                Log.d("RETROFIT", "onFailure " + t.getMessage());
            }
        });

        mRecyclerView.addOnItemTouchListener(new RecyclerItemListener(getApplicationContext(),
                mRecyclerView, new RecyclerItemListener.RecyclerTouchListener() {
            @Override
            public void onClickItem(View view, int position) {
                System.out.println(" * * * * * On Click Item interface");
            }

            @Override
            public void onLongClickItem(View v, int position) {
                System.out.println(" * * * * * On Long Click Item interface");
            }
        }));

    }
}
