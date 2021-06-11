package com.example.mobileassementkabo.Core.Network;

import com.example.mobileassementkabo.Core.Models.ArticleList;
import com.example.mobileassementkabo.R;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
//Todo Need to make use of env variable for nyt_api_key
 @GET("7.json?api-key=0Jd3Tp86YckFRA9yjYQLnfWgLTiP54GCo")
 Call<ArticleList> getArticleList();



}
