package com.example.mobileassementkabo.Core.Network;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {

    public static String NYT_API_KEY = "0Jd3Tp86YckFRA9yjYQLnfWgLTiP54GC";
    public static String BASE_URL = "https://api.nytimes.com/svc/mostpopular/v2/viewed/";
    private static Retrofit retrofit;

    public static Retrofit getRetroClient(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder()
                               .baseUrl(BASE_URL)
                               .addConverterFactory(GsonConverterFactory.create())
                               .build();
        }
        return retrofit;
    }
}