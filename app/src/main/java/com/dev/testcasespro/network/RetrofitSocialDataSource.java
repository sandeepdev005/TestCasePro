package com.dev.testcasespro.network;

import com.dev.testcasespro.models.Comment;
import com.dev.testcasespro.models.RetroPhoto;
import com.dev.testcasespro.models.Todo;
import com.dev.testcasespro.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitSocialDataSource {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

    @GET("/comments")
    Call<List<Comment>> getAllComments();

    @GET("/users")
    Call<List<User>> getAllUsers();

    @GET("/todos")
    Call<List<Todo>> getTodo();
}
