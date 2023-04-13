package com.dxc.Movie.Controller;

import com.dxc.Movie.Entity.Movies;
import com.dxc.Movie.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Movie")
public class MovieController {
//autowire the BooksService class
    @Autowired
    MovieService movieService;

    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/GetMovie")
        private List<Movies> getMovieController() {
            return movieService.getAllMovie();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/getIdMovie/{movieid}")
    private Movies getMovie(@PathVariable("movieid") int movieid)
    {
        return movieService.getMoviesById(movieid);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/delete/{movieid}")
     private void DeleteMovieController(@PathVariable("movieid") int movieid)
    {
        movieService.delete(movieid);
    }


    //creating post mapping that post the book detail in the database
    @PostMapping("/AddMovie")
    private int AddMovieController(@RequestBody Movies movies)
    {
        movieService.saveOrUpdate(movies);
        return movies.getMovieid();
    }

    //creating put mapping that updates the book detail
    @PutMapping("/UpdateMovie")
     private Movies UpdateMovieController(@RequestBody Movies movies)
    {
        movieService.saveOrUpdate(movies);
        return movies;
    }


}