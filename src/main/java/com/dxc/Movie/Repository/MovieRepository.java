package com.dxc.Movie.Repository;

import org.springframework.data.repository.CrudRepository;
import com.dxc.Movie.Entity.Movies;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movies,Integer> {
}
