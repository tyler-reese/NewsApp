package com.example.newsapp;

public class Article {

    private String mTitle;
    private String mSection;
    private String mPublishDate;
    private String mAuthor;
    private String mURL;

    public Article(String title, String section, String date, String author, String url) {
        mTitle = title;
        mSection = section;
        mPublishDate = date;
        mAuthor = author;
        mURL = url;
    }

    public String getArticleTitle() { return mTitle; }
    public String getSection() { return mSection; }
    public String getPublishDate() { return mPublishDate; }
    public String getAuthor() { return mAuthor; }
    public String getURL() { return mURL; }
}