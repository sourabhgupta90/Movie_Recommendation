package com.hashedin.model;

import java.util.ArrayList;
/**
 * 
 * @author sourabh contains info of movie
 *
 */

public class Movie  {

	private int movieId;
	private String movieName;
	private String date;
	
	private ArrayList<Genre> genreobj;

	
	

	public Movie(int movieId, String movieName, String date,
			ArrayList<Genre> genreobj) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.date = date;
		this.genreobj = genreobj;
	}

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName
				+ ", date=" + date + ", genreobj=" + genreobj + "]";
	}
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Genre> getGenreobj() {
		return genreobj;
	}

	public void setGenreobj(ArrayList<Genre> genreobj) {
		this.genreobj = genreobj;
	}
	
	
	
	
	

}