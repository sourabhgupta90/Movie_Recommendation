package com.hashedin.model;

public class Rating {

	private Movie movieObj;
	private User userObj;
	private int rating;
	private int timestamp;


	@Override
	public String toString() {
		return "Rating [movieObj=" + movieObj + ", userObj=" + userObj
				+ ", rating=" + rating + ", timestamp=" + timestamp + "]";
	}

	public Rating(Movie movieObj, User userObj, int rating, int timestamp) {
		super();
		this.movieObj = movieObj;
		this.userObj = userObj;
		this.rating = rating;
		this.timestamp = timestamp;
	}



	public Rating() {
		// TODO Auto-generated constructor stub
	}

	public Movie getMovieObj() {
		return movieObj;
	}

	public void setMovieObj(Movie movieObj) {
		this.movieObj = movieObj;
	}

	public User getUserObj() {
		return userObj;
	}

	public void setUserObj(User userObj) {
		this.userObj = userObj;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	

}
