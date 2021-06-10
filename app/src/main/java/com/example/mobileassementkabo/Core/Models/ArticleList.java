package com.example.mobileassementkabo.Core.Models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ArticleList {


        @SerializedName("results")
        private List<ArticleModel> articles;
        // ...
        public List<ArticleModel> getArticles() {
                return articles;
        }
}
