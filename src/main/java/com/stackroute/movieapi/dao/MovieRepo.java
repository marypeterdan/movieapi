// create an interface named MovieRepo which extends JpaRepository

package com.stackroute.movieapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.movieapi.model.Movie;

import java.util.List;


public interface MovieRepo extends JpaRepository<Movie, Integer> {

// add a finder method to find the movie by name which returns list of movies
List<Movie> findByMovieName(String movieName);
 
}
