package com.example.mobileassementkabo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class ArticleDetailActivity extends AppCompatActivity {

    TextView articleTxt,bylineTxt,publishedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        //Get Intent data
        Intent i = getIntent();

        final String article_title = i.getExtras().getString("title");
        final String article_published_date = i.getExtras().getString("published");
        final String article_by_line = i.getExtras().getString("byline");


        articleTxt= (TextView) findViewById(R.id.ad_article_title);
        bylineTxt= (TextView) findViewById(R.id.ad_article_byline);
        publishedTxt= (TextView) findViewById(R.id.ad_article_published);


        //Assign data to view components
        articleTxt.setText(article_title);
        bylineTxt.setText("By Line : "+article_by_line);
        publishedTxt.setText("Published : "+article_published_date);

    }
}