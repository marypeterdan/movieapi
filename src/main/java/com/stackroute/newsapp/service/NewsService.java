package com.stackroute.newsapp.service;
// create a service class named news service
// use the below import to use the @Service annotation
import org.springframework.stereotype.Service;
//use the below import to use the @Autowired annotation
//use the below import to use the RestTemplate
//use the below import to use the List
//use the below import to use the ArrayList
//use the below import to use the HttpHeaders
//use the below import to use the HttpEntity
//use the below import to use the ResponseEntity
//use the below import to use the ObjectMapper
//use the below import to use the Article class
//use the below import to use the ArticleRepo class
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.newsapp.model.Article;
import com.stackroute.newsapp.repository.ArticleRepo;

@Service
public class NewsService {

    //  getNews which returns the list of articles
    // https://newsapi.org/v2/top-headlines?country=us&apiKey=7f118af83e1b48f6939fc5096e89fd22


    public String getNews()
    {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Api-Key", "7f118af83e1b48f6939fc5096e89fd22");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange("https://newsapi.org/v2/top-headlines?country=us&apiKey=7f118af83e1b48f6939fc5096e89fd22", HttpMethod.GET, entity, String.class);
        String result = response.getBody();
//convert result string into json object

 //use JSONObject to convert json to java object








        return  result;
//        ObjectMapper mapper = new ObjectMapper();
//        Article[] articles = null;
//        try {
//            articles = mapper.readValue(result, Article[].class);
//            System.out.println(articles);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        List<Article> articleList = new ArrayList<Article>();
//        if (articles != null) {
//            for (Article article : articles) {
//                articleList.add(article);
//            }
//        }
//
//        return articleList;
    }

}
