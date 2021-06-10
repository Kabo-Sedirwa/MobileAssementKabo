package com.example.mobileassementkabo.Core.Network;

import com.example.mobileassementkabo.Core.Models.ArticleList;
import com.example.mobileassementkabo.Core.Models.ArticleModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface APIService {

 @GET("7.json?api-key=0Jd3Tp86YckFRA9yjYQLnfWgLTiP54GC")
 Call<ArticleList> getArticleList();



}
