

// create an entity class named Movie with the attributes movidId,movieName,year

package com.stackroute.movieapi.model;

// import packages of entity and id  using jakarta.persistence
import jakarta.persistence.Entity;
import jakarta.persistence.Id;






@Entity
public class Movie {
    @Id
    private int movieId;
    private String movieName;
    private int year;
    
    public Movie() {
        super();
    }
    
    public Movie(int movieId, String movieName, int year) {
        super();
        this.movieId = movieId;
        this.movieName = movieName;
        this.year = year;
    }
    
    public int getMovieId() {
        return movieId;
    }
    
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", year=" + year + "]";
    }
    
}
