package com.dimsed.newsapps2;

public class ModelClass {

    private String author,tittle,description,url,urltoimage,published;

    public ModelClass(String author, String tittle, String description, String url, String urltoimage, String published) {
        this.author = author;
        this.tittle = tittle;
        this.description = description;
        this.url = url;
        this.urltoimage = urltoimage;
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrltoimage() {
        return urltoimage;
    }

    public void setUrltoimage(String urltoimage) {
        this.urltoimage = urltoimage;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }
}
