package com.stackroute.newsapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// use the below import to use the @Entity annotation
import jakarta.persistence.Entity;

//use the below import to use the @Table annotation
import jakarta.persistence.Table;
@Entity
public class Article {
    //create the below attributes for the article class
    //source, author, title, description, url, urlToImage, publishedAt, content
    //generate getters and setters
    //generate toString method
    //generate constructor with all fields
    //generate a filed named articleid of type int and autoincrement and make it primary key with getter and setter


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int articleid;
    public int getArticleid() {
        return articleid;
    }
    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }


    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;

    private String publishedAt;
    private String content;

    public Article() {
    }

    public Article(  String author, String title, String description, String url, String urlToImage,
                   String publishedAt, String content) {
        super();

        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;

        this.publishedAt = publishedAt;
        this.content = content;
    }

    public String toString() {
        return "Article [ author=" + author + ", title=" + title + ", description=" + description
                + ", url=" + url + ", urlToImage=" + urlToImage + ", publishedAt=" + publishedAt + ", content="
                + content + "]";
    }
}