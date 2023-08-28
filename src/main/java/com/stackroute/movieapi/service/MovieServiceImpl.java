// create a service class named MovieServiceImpl which implements MovieService
// use MovieRepo to perform CRUD operations

package com.stackroute.movieapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.movieapi.dao.MovieRepo;
import com.stackroute.movieapi.model.Movie;

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepo;

//START_CODE
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepo movieRepo;

	@Override
	public Movie addMovie(Movie movie) {
		log.info("Adding movie");
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		log.info("Getting all movies");
		return movieRepo.findAll();
	}
package com.stackroute.movieapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.movieapi.dao.MovieRepo;
import com.stackroute.movieapi.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepo movieRepo;

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(int id) {
		Optional<Movie> optional = movieRepo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Movie> getMovieByName(String movieName) {
		return movieRepo.findByMovieName(movieName);
	}

	@Override
	public void deleteMovie(int id) {
		movieRepo.deleteById(id);

	}

}
	@Override
	public Movie getMovieById(int id) {
		log.info("Getting movie by id");
		Optional<Movie> optional = movieRepo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Movie> getMovieByName(String movieName) {
		log.info("Getting movie by name");
		return movieRepo.findByMovieName(movieName);
	}

	@Override
	public void deleteMovie(int id) {
		log.info("Deleting movie");
		movieRepo.deleteById(id);

	}

}