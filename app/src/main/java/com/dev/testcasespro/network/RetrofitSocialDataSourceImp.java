package com.dev.testcasespro.network;

import android.util.Log;

import com.dev.testcasespro.models.Comment;
import com.dev.testcasespro.models.RetroPhoto;
import com.dev.testcasespro.models.Todo;
import com.dev.testcasespro.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitSocialDataSourceImp {
    private static final String TAG = "RetrofitSocailDataSourc";
    RetrofitSocialDataSource dataSourceService = (RetrofitSocialDataSource) RetrofitClientInstance.getRetrofitInstance().create(RetrofitSocialDataSource.class);

    public void getPhotoData() {
        Call<List<RetroPhoto>> call = dataSourceService.getAllPhotos();
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {
                Log.i(TAG, response.body().toString());
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {
                Log.i(TAG, t.getMessage());
            }
        });
    }



    public void getAllComment(){
        Call<List<Comment>> call = dataSourceService.getAllComments();
        call.enqueue(new Callback<List<Comment>>() {
            @Override
            public void onResponse(Call<List<Comment>> call, Response<List<Comment>> response) {

            }

            @Override
            public void onFailure(Call<List<Comment>> call, Throwable t) {

            }
        });
    }

    public void getAllUsers(){
        Call<List<User>> call = dataSourceService.getAllUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {

            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }


    public void getAllTodoList(){
        Call<List<Todo>> call = dataSourceService.getTodo();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {

            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {

            }
        });
    }
}
