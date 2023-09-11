package com.hsbc.firstSpringBoot.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.movies.MovieService;
import com.hsbc.movies.Movies;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movies> getMovies(){
		return movieService.search();
	}

}
