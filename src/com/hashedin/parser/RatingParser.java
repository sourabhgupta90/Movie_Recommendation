package com.hashedin.parser;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.hashedin.model.Rating;

public class RatingParser {

	private String ratingFileName;
	
	public RatingParser(String ratingFileName) {
		super();
		this.ratingFileName = ratingFileName;
	}

	public List<Rating> getRating() {
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

				ratingObj.setUserId(Integer.valueOf(tokens[0]));
				ratingObj.setMovieId(Integer.valueOf(tokens[1]));
				ratingObj.setRating(Integer.valueOf(tokens[2]));
				ratingObj.setTimestamp(Integer.valueOf(tokens[3]));
				userRating.add(ratingObj);

			}
			in.close();
		} catch (Exception e) {
			System.err.println("input file does not exists");
		}

		return userRating;

	}
}