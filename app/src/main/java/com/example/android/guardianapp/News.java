package com.example.android.guardianapp;

public class News {
    private String mTitle;
    private String mSection;
    private String mTime;
    private String mUrl;
    private String mAuthor;

    public String getTitle() {
        return mTitle;
    }
    public String getSection() {
        return mSection;
    }
    public String getTime() {
        return mTime;
    }
    public String getUrl() {
        return mUrl;
    }
    public String getAuthor() {
        return mAuthor;
    }

    public News(String title, String section, String time, String url, String author) {
        this.mTitle = title;
        this.mSection = section;
        this.mTime = time;
        this.mUrl = url;
        this.mAuthor = author;
    }
}
