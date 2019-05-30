package com.lolipop.joke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String Base_URL = "http://official-joke-api.appspot.com/jokes/random/";

    @GET(Base_URL)
    Call<Joke>getJoke();
}
