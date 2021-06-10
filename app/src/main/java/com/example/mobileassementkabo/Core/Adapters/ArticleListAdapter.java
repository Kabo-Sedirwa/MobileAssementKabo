package com.example.mobileassementkabo.Core.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mobileassementkabo.ArticleDetailActivity;
import com.example.mobileassementkabo.Core.Models.ArticleList;
import com.example.mobileassementkabo.R;

public class ArticleListAdapter extends RecyclerView.Adapter<ArticleListAdapter.MyViewHolder> {
    private Context context;
    private ArticleList articleList;

    public ArticleListAdapter(Context context, ArticleList articleList) {
        this.context = context;
        this.articleList = articleList;
    }

    public void setArticleList(ArticleList articleList) {
        this.articleList = articleList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ArticleListAdapter.MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.recyclerview_layout,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleListAdapter.MyViewHolder holder, int position) {
        holder.article_title.setText(this.articleList.getArticles().get(position).getTitle());
        holder.article_published_date.setText(this.articleList.getArticles().get(position).getPublished_date());
        holder.article_by_line.setText(this.articleList.getArticles().get(position).getByline());

        //when item is clicked
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Intent i = new Intent(context, ArticleDetailActivity.class);

                i.putExtra("title", articleList.getArticles().get(pos).getTitle());
                i.putExtra("published", articleList.getArticles().get(pos).getPublished_date());
                i.putExtra("byline", articleList.getArticles().get(pos).getByline());


                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        if(this.articleList != null){
            return this.articleList.getArticles().size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView article_title;
        TextView article_published_date;
        TextView article_by_line;
        private ItemClickListener itemClickListener;

        public MyViewHolder(View itemView) {
            super(itemView);
            article_title = (TextView)itemView.findViewById(R.id.rv_article_title);
            article_published_date = (TextView)itemView.findViewById(R.id.rv_pub_date);
            article_by_line = (TextView)itemView.findViewById(R.id.rv_article_byline);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            this.itemClickListener.onItemClick(view,getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener ic)
        {
            this.itemClickListener=ic;

        }
    }
}
