package com.dimsed.newsapps2;

import java.util.ArrayList;

public class mainNew {

    private String status;
    private String totalResult;
    private ArrayList<ModelClass> articles;

    public mainNew(String status, String totalResult, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResult = totalResult;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(String totalResult) {
        this.totalResult = totalResult;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}