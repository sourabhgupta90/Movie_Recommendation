package com.hashedin.movie;

import java.util.List;
import java.util.Map;

public class MovieRecommend {

	/**
	 * This main function, the execution of program
	 * @param args- It take the array of String.
	 * 
	 */

	public static void main(String args[]) {

		/*
		 * // parsing of user.data file
		 * 
		 * Parsing parserUserObj = new Parsing(); Map<Integer, User> userData =
		 * parserUserObj.getUserData(); System.out.println(userData);
		 * 
		 * // parsing of movie.data file
		 * 
		 * 
		 * Parsing parserMovieObj = new Parsing(); Map<Integer, Movie> movieData
		 * = parserMovieObj.getMovieData(); System.out.println(movieData);
		 * 
		 * //parsing of rating.data file
		 * 
		 * Parsing parserRatingObj = new Parsing(); List<Rating> userRating =
		 * parserRatingObj.getRating(); System.out.println("userRating " +
		 * userRating);
		 */
		
		
		/**
		 *  top movie by genre
		 */
		Movie movieObj = new Movie();

		List<Integer> movieIdList = movieObj.getMovieIdList();
		//System.out.println("movieIdList " + movieIdList);

		Rating ratingObj = new Rating();

		String topMovieByGenre = ratingObj.getTopMovieByGenre(movieIdList);
		System.out.println("top movie by genre " + topMovieByGenre);

		
	}
}