package com.hashedin.movie;
import java.util.List;

public interface MatrixInterface {

	/**
	 * getMovieIdList method gives the list of movies in a specified genre
	 */

	public List<Integer> getMovieIdList();

	/**
	 * getTopMovieByGenre method print the top rating movie in a specified genre
	 */
	
	public String getTopMovieByGenre(List<Integer> movieIdList);

	public String mostWatchedMovie();
}
