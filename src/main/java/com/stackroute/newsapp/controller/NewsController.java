package com.stackroute.newsapp.controller;

// use the below import to use the @RestController annotation
import com.stackroute.newsapp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// create a controller class named NewsController
@RestController
public class NewsController {

    // autowire the service class
    @Autowired
    private NewsService newsService;

    // use the get mapping and return the list of articles as response entity
    // http://localhost:8080/api/v1/news

    @GetMapping("/api/v1/news")
public ResponseEntity<?> getNews()
    {
        return new ResponseEntity<>(newsService.getNews(), HttpStatus.OK);
    }




}
