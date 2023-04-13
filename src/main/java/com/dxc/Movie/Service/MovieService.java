package com.dxc.Movie.Service;

import java.util.ArrayList;
import java.util.List;

import com.dxc.Movie.Entity.Movies;
import com.dxc.Movie.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    //getting all books record by using the method findaAll() of CrudRepository
    public List<Movies> getAllMovie(){
            List<Movies> movies = new ArrayList<Movies>();
            movieRepository.findAll().forEach(movie1 -> movies.add(movie1));
            return movies;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Movies getMoviesById(int id)
    {
        return movieRepository.findById(id).get();
    }


    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Movies movies)
    {
        movieRepository.save(movies);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        movieRepository.deleteById(id);
    }
    //updating a record
    public void UpdateMovieController(Movies movies, int movieid)
    {
        movieRepository.save(movies);
    }
}
