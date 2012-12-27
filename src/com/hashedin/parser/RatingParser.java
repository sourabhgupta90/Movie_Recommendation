package com.hashedin.parser;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.hashedin.model.Rating;
import com.hashedin.model.User;

public class RatingParser {

	private String ratingFileName;
	
	//public static final Logger LOGGER = Logger.getLogger(RatingParser.class);

	
	public RatingParser(String ratingFileName) {
		super();
		this.ratingFileName = ratingFileName;
	}
	
	public <Movie> List<Rating> getRating(Map <Integer,Movie> movieMap,Map <Integer,User > userMap  ) {
		List<Rating> userRating = new ArrayList<Rating>();

		try {

			// Input rating.data file
			FileInputStream fstream = new FileInputStream(ratingFileName);

			DataInputStream in = new DataInputStream(fstream);

			while (in.available() != 0) {

				// split the rating.data file into tokens
				Rating ratingObj = new Rating();
				String inputLine = in.readLine();

				String tokens[] = inputLine.split("\t");

				ratingObj.setMovieObj((com.hashedin.model.Movie) movieMap.get(Integer.valueOf(tokens[1])));
				ratingObj.setUserObj( (User) movieMap.get(Integer.valueOf(tokens[2]) ) );;
				ratingObj.setRating(Integer.valueOf(tokens[2]));
				ratingObj.setTimestamp(Integer.valueOf(tokens[3]));
				userRating.add(ratingObj);

			}
			in.close();
		} catch (Exception e) {
			System.err.println("input file does not exists");
			//LOGGER.info("parsing is complete");
		}
		
		return userRating;

	}
}