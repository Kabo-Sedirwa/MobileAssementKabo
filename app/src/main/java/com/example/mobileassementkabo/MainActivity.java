package com.example.mobileassementkabo;

import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.example.mobileassementkabo.Core.Adapters.ArticleListAdapter;
import com.example.mobileassementkabo.Core.Models.ArticleList;
import com.example.mobileassementkabo.Core.ViewModels.ArticleListViewModel;


public class MainActivity extends AppCompatActivity {
private ArticleList articleModelList;
private  ArticleListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        final TextView no_result = findViewById(R.id.noResultTv);
        final ProgressBar progressBar = findViewById(R.id.progressBar);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        adapter =  new ArticleListAdapter(this, articleModelList);
        recyclerView.setAdapter(adapter);
        progressBar.setVisibility(View.VISIBLE);

        ArticleListViewModel viewModel = new ViewModelProvider(this).get(ArticleListViewModel.class);
        viewModel.getArticleListObserver().observe(this, articleModels -> {
            if(articleModels != null){
                articleModelList = articleModels;
                adapter.setArticleList(articleModels);
                progressBar.setVisibility(View.GONE);
                no_result.setVisibility(View.GONE);
            }else{

                no_result.setVisibility(View.VISIBLE);

            }
        });
        viewModel.getLists();
    }
}