package com.hsbc.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieDAO movieDAO;
	
	public List<Movies> search(){
		return movieDAO.findALL();
		
	}

}
