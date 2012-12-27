package com.hashedin.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hashedin.model.Genre;
import com.hashedin.model.Movie;
import com.hashedin.model.Rating;
import com.hashedin.model.User;
import com.hashedin.movieRecommendation.MovieDatabase;
import com.hashedin.movieRecommendation.MovieManager;


public class FileHandlingParser implements MovieManager {

	private String movieFileName;
	private String userFileName;
	
	private String ratingsFileName;
	


	public FileHandlingParser(String movieFileName, String userFileName, String ratingsFileName) {
		super();
		this.movieFileName = movieFileName;
		this.userFileName = userFileName;
		
		this.ratingsFileName = ratingsFileName;
	}

	public MovieDatabase getMovieDatabase() {
		
		 
		 MovieParser movieParserObj = new MovieParser(movieFileName);
		 
		 Map <Integer,Movie> movieData = movieParserObj.getMovieData();	
		 
		 UserParser userParserObj = new UserParser(userFileName);
		 
		 Map<Integer, User> userData = userParserObj.getUserData() ;

		 RatingParser ratingParserObj = new RatingParser(ratingsFileName);
		 List<Rating>RatingObj =  ratingParserObj.getRating(movieData,userData);
		 
				 
	/*	
	  List<Rating> userRating = new ArrayList<Rating>();
	  
	  
	  Rating r1 = new Rating(movie1, user1, 2, 42131); 
	  Rating r2 = new Rating(movie2, user2, 3, 42131); 
	  Rating r3 = new Rating(movie3, user3, 3, 42131); 
	  Rating r4 = new Rating(movie2, user4, 1, 42131);
	  
	  userRating.add(r1); 
	  userRating.add(r2); 
	  userRating.add(r3);
	  userRating.add(r4); 
	 
	  MovieDatabase movieDatabaseObj = new MovieDatabase();
	  
	  movieDatabaseObj.setMovieMap(movieData);
	  movieDatabaseObj.setRatingList(userRating);
	  movieDatabaseObj.setUserMap(userData);
	  
	  return movieDatabaseObj;

*/		
		
		return null;
	
	
	}
}
