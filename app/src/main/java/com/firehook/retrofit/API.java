package com.firehook.retrofit;

import com.firehook.retrofit.modelAnswers.Questions;
import com.firehook.retrofit.modelCategories.Quiz;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    @GET("api/v1/quizzes/0/100")
    Call<Quiz> getQuiz();

    @GET("api/v1/quizzes/{id}/100")
    Call<Questions> getQuestions(@Path("id") String id);
}
