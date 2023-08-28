// create a interface named MovieService which has the following methods
// addMovie(Movie movie) which takes Movie object as argument and returns Movie object
// getAllMovies() which returns list of Movie objects
// getMovieById(int id) which takes id as argument and returns Movie object

package com.stackroute.movieapi.service;

import java.util.List;

import com.stackroute.movieapi.model.Movie;

public interface MovieService {
    public Movie addMovie(Movie movie);
    public List<Movie> getAllMovies();
   
    public List<Movie> getMovieByName(String movieName);
   
}
