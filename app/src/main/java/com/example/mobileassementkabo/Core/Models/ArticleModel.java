package com.example.mobileassementkabo.Core.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticleModel {

    private String published_date;
    private String section;
    private String subsection;
    private String byline;
    private String title;
    private String article_abstract;

    public ArticleModel(String published_date, String section, String subsection, String byline, String title, String article_abstract) {
        this.published_date = published_date;
        this.section = section;
        this.subsection = subsection;
        this.byline = byline;
        this.title = title;
        this.article_abstract = article_abstract;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle_abstract() {
        return article_abstract;
    }

    public void setArticle_abstract(String article_abstract) {
        this.article_abstract = article_abstract;
    }
}

