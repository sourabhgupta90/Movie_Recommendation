package com.hashedin.movieRecommendation;

/**
 * @author sourabh 
 * @see movie database constains map for user and movie and list for rating
 * 
 * 
 */
import java.util.List;
import java.util.Map;

import com.hashedin.model.Movie;
import com.hashedin.model.Rating;
import com.hashedin.model.User;


public class MovieDatabase {

	private Map <Integer,Movie> movieMap;
	
	private Map <Integer,User> userMap;
	
	private List <Rating> ratingList;

	public Map<Integer, Movie> getMovieMap() {
		return movieMap;
	}

	public void setMovieMap(Map<Integer, Movie> movieMap) {
		this.movieMap = movieMap;
	}

	public Map<Integer, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<Integer, User> userMap) {
		this.userMap = userMap;
	}

	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}

}
