// create a class name MovieController which is a RestController

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

//imports for @RestController and @RequestMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import response entity and http status
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


// use MovieService to perform CRUD operations

import com.stackroute.movieapi.model.Movie;
import com.stackroute.movieapi.service.MovieService;

@RestController
class MovieController
{
    @Autowired
    private MovieService movieService;
 
 // post mapping for /addMovie which takes Movie object as request body and returns Movie object as ResponseEntity
    @RequestMapping("/addMovie")
    public ResponseEntity<Movie> addMovie(Movie movie)
    {
        return new ResponseEntity<Movie>(movieService.addMovie(movie),HttpStatus.OK);
    }
    
    
    @RequestMapping("/getAllMovies")
    public List<Movie> getAllMovies()
    {
        return movieService.getAllMovies();
    }
    
    // @RequestMapping("/getMovieById")
    // public Movie getMovieById(int id)
    // {
    //     return movieService.getMovieById(id);
    // }
     
     // requestmapping for getMovieByName/moviename  which takes movieName as path variable  and returns list of movies as ResponseEntity
    @RequestMapping("/getMovieByName/{movieName}")
    public ResponseEntity<List<Movie>> getMovieByName(String movieName)
    {
        return new ResponseEntity<List<Movie>>(movieService.getMovieByName(movieName),HttpStatus.OK);
    }
 
}

 