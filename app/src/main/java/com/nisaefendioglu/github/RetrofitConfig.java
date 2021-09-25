package com.nisaefendioglu.github;

import retrofit2.Retrofit;

public class RetrofitConfig {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();

}
