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

public class HardCodedData implements MovieManager {

	@Override
	public MovieDatabase getMovieDatabase() {
		// TODO Auto-generated method stub

		Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();

		ArrayList<Genre> listGen = new ArrayList<Genre>();

		listGen.add(Genre.ACTION);
		listGen.add(Genre.ADVENTURE);

		Movie movie1 = new Movie(1, "Silence of lambs ", "11 dec 2011", listGen);
		Movie movie2 = new Movie(2, "Pay it forward", "12 dec 2012", listGen);
		Movie movie3 = new Movie(3, "The Green Mile", "13 dec 2014", listGen);

		movieData.put(movie1.getMovieId(), movie1);
		movieData.put(movie2.getMovieId(), movie2);
		movieData.put(movie3.getMovieId(), movie3);

		Map<Integer, User> userData = new HashMap<Integer, User>();

		User user1 = new User(1, 27, 'M', "Engineer");
		User user2 = new User(2, 19, 'F', "Student");
		User user3 = new User(3, 34, 'M', "Doctor");
		User user4 = new User(2, 29, 'F', "Teacher");

		userData.put(user1.getUserId(), user1);
		userData.put(user2.getUserId(), user2);
		userData.put(user3.getUserId(), user3);
		userData.put(user4.getUserId(), user4);

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
	}
}
