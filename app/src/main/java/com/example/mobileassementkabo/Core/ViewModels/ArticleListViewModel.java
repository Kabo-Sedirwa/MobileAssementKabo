package com.example.mobileassementkabo.Core.ViewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mobileassementkabo.Core.Models.ArticleList;
import com.example.mobileassementkabo.Core.Models.ArticleModel;
import com.example.mobileassementkabo.Core.Network.APIService;
import com.example.mobileassementkabo.Core.Network.RetroInstance;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleListViewModel extends ViewModel {

    private MutableLiveData<ArticleList> articleList;

    public ArticleListViewModel() {
        articleList = new MutableLiveData<>();
    }

    public  MutableLiveData<ArticleList> getArticleListObserver (){
        return articleList;
    }

    public void getLists(){

        APIService apiService = RetroInstance.getRetroClient().create(APIService.class);
        Call<ArticleList> call = apiService.getArticleList();
        call.enqueue(new Callback<ArticleList>() {
            @Override
            public void onResponse(Call<ArticleList> call, Response<ArticleList> response) {
                System.out.print("Network Call - DEBUG: "+ response.body());
                articleList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<ArticleList> call, Throwable t) {
                System.out.println("Failure Call : "+ t.toString());
                articleList.postValue(null);
            }
        });
    }
}
