package com.stackroute.newsapp.repository;
// build   the below interface for accessing jpa repository
// use the below import to use the JpaRepository
import com.stackroute.newsapp.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepo extends JpaRepository<Article,Integer> {
    //define a finder method to return list of articles for the given author

    List<Article> findByAuthor(String author);




}

