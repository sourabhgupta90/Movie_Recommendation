package com.hashedin.parser;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.hashedin.model.Genre;
import com.hashedin.model.Movie;
import com.hashedin.movieRecommendation.MovieRecommend;

public class MovieParser {

	private String movieFileName;
	
	public static final Logger LOGGER = Logger.getLogger(MovieParser.class);

	public Map<Integer, Movie> getMovieData() {

		
		
		Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();

		Movie movie1 = new Movie();
		
		try {

			FileInputStream fstream = new FileInputStream(movieFileName);

			DataInputStream in = new DataInputStream(fstream);

			while (in.available() != 0) {

				// split the Inputline into tokens

				String inputLine = in.readLine();
				String tokens[] = inputLine.split("[|]+");

				
				if( tokens[0]=="" || tokens[1]=="" || tokens[2]=="" || tokens[3]=="" || tokens[4]==""){
					LOGGER.info("error");
					continue;
				}
				
				movie1.setMovieId(Integer.valueOf(tokens[0]));
				movie1.setMovieName(tokens[1]);
				movie1.setDate(tokens[2]);

				// genreArray for the list of specified genre of a movie
				ArrayList<Genre> listGen = new ArrayList<Genre>();
				 
				listGen.add(Genre.ACTION);
				listGen.add(Genre.ADVENTURE);
				Genre g = null;
				
				int GENRE_TYPES = 19;
				for (int t = 0; t < GENRE_TYPES; t++) {
					
					if(Integer.valueOf(tokens[4 + t]) == 1 ){
						listGen.add(g.fromCode(t));
						
					}
				}
				//System.out.println(listGen);
				// System.out.println(movie1);
				movie1.setGenreobj(listGen);
				//System.out.println(movie1);
				movieData.put(movie1.getMovieId(), movie1);

			}
			in.close();
		} catch (Exception e) {
			System.err.println("input file does not exists");
		}
		return movieData;

	}
	
	public String getMovieFileName() {
		return movieFileName;
	}

	public void setMovieFileName(String movieFileName) {
		this.movieFileName = movieFileName;
	}

	@Override
	public String toString() {
		return "MovieParser [movieFileName=" + movieFileName + "]";
	}

	public MovieParser(String movieFileName) {
		super();
		this.movieFileName = movieFileName;
	}
	
	











}
