package com.dev.testcasespro.datasource;

import org.junit.BeforeClass;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseDataSourceTest {

    public static Retrofit retrofit;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    protected static final int CALLBACK_TIMEOUT = 120;

    @BeforeClass
    public static void init() {
        retrofit = getRetrofitInstance();
    }

    public static Retrofit getRetrofitInstance() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor).build();

        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
