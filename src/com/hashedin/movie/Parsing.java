package com.hashedin.movie;
import java.io.DataInputStream;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parsing {

	public Map<Integer, Movie> getMovieData() {

		/*
		 * //hard coded data 
		 * movieData is a map for storing movie class object with key of movieID
		 * Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();
		 * 
		 * //genreArray for the list of specified genre of a movie
		 * 
		 * int genreArray1[] = { 1, 0, 1, 0 }; 
		 * int genreArray2[] = { 1, 1, 1, 0 };
		 * int genreArray3[] = { 1, 0, 1, 0 };
		 * 
		 * Movie movie1 = new Movie(1, "Silence of lambs ", genreArray1, "12 dec 2012");
		 * Movie movie2 = new Movie(2, "Pay it forward", genreArray2, "12 dec 2003");
		 * Movie movie3 = new Movie(3, "The Green Mile", genreArray3, "12 dec 2002");
		 * 
		 * movieData.put(movie1.getMovieId(), movie1);
		 * movieData.put(movie2.getMovieId(), movie2);
		 * movieData.put(movie3.getMovieId(), movie3);
		 * 
		 * return movieData;
		 */

		// //////////////////////////////////////////////////////////////////////////////////////
		Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();

		Movie movie1 = new Movie();
		try {

			FileInputStream fstream = new FileInputStream("movieEdit.data");

			DataInputStream in = new DataInputStream(fstream);

			while (in.available() != 0) {

				// split the Inputline into tokens
				
				String inputLine = in.readLine();
				String tokens[] = inputLine.split("[|]+");

				movie1.setMovieId(Integer.valueOf(tokens[0]));
				movie1.setMovieName(tokens[1]);
				movie1.setDate(tokens[2]);
				
				//genreArray for the list of specified genre of a movie
				
				int genreArray[] = new int[19];

				for (int t = 0; t < genreArray.length; t++) {
					genreArray[t] = Integer.valueOf(tokens[4 + t]);
				}

				movie1.setGenre(genreArray);
				//System.out.println(movie1);
				movieData.put(movie1.getMovieId(), movie1);

			}
			in.close();
		} catch (Exception e) {
			System.err.println("input file does not exists");
		}
		return movieData;
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

	public Map<Integer, User> getUserData() {

		//map for storing the info of user with the key of userId  
		Map<Integer, User> UserData = new HashMap<Integer, User>();

		//hardcoded data of user
		
		User User1 = new User(1, 27, 'M', "Engineer");
		User User2 = new User(2, 19, 'F', "Student");
		User User3 = new User(3, 34, 'M', "Doctor");
		User User4 = new User(4, 29, 'F', "Teacher");
		
		UserData.put(User1.getUserId(), User1);
		UserData.put(User1.getUserId(), User2);
		UserData.put(User1.getUserId(), User3);
		UserData.put(User1.getUserId(), User4);
		return UserData;

	}

	public List<Rating> getRating() {

		/*
		 * //hard coded data 
		 * userRating list contain the object of rating class
		 * List<Rating> userRating = new ArrayList<Rating>();
		 * 
		 * Rating ratingObj = new Rating();
		 * Rating r1 = new Rating(1, 1, 2, 42131); 
		 * Rating r2 = new Rating(2,2,3, 42131); 
		 * Rating r3 = new Rating(3, 3, 3, 42131); 
		 * Rating r4 = newRating(4, 2, 1, 42131);
		 * 
		 * userRating.add(r1); userRating.add(r2); 
		 * userRating.add(r3);
		 * userRating.add(r4); return userRating;
		 */
		//userRating list contain the object of rating class 
		List<Rating> userRating = new ArrayList<Rating>();
		Rating ratingObj = new Rating();

		try {

			//Input rating.data file 
			FileInputStream fstream = new FileInputStream("ratingsEdit.data");

			
			DataInputStream in = new DataInputStream(fstream);
			
			while (in.available() != 0) {

				//split the rating.data file into tokens
				String inputLine = in.readLine();

				String tokens[] = inputLine.split("\t");

				
				ratingObj.setUserId(Integer.valueOf(tokens[0]));
				ratingObj.setMovieId(Integer.valueOf(tokens[0]));
				ratingObj.setRating(Integer.valueOf(tokens[0]));
				ratingObj.setTimestamp(Integer.valueOf(tokens[0]));

				userRating.add(ratingObj);

			}
			in.close();
		} catch (Exception e) {
			System.err.println("input file does not exists");
		}
		return userRating;
	}

}
