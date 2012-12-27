package com.hashedin.movieRecommendation;


import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.hashedin.model.Movie;
import com.hashedin.model.User;
import com.hashedin.parser.FileHandlingParser;
import com.hashedin.parser.HardCodedData;
import com.hashedin.parser.MovieParser;
import com.hashedin.parser.UserParser;

public class MovieRecommend {

	/**
	 * This main function, the execution of program1
	 * @param args- It take the array of String.
	 * 
	 */
	public static final Logger LOGGER = Logger.getLogger(MovieRecommend.class);
	public static void main(String args[]) {

		MovieManager movieManagerObj = new HardCodedData();
		
		MovieBuff movieBuffObj  = new MovieBuff(movieManagerObj);
		
		
		//System.out.print(movieBuffObj.getMostWatchedMovieName());
		
		//List<Integer>  movieIdList= movieBuffObj.getMovieIdListByGenre();
		//System.out.print(movieBuffObj.getTopMovieRatingName(movieIdList));
		
		//List<Integer>  movieIdList= movieBuffObj.getMovieIdListByyear();
		//System.out.print(movieBuffObj.getTopMovieRatingName(movieIdList));
		
		
	/*	List<Integer>  movieIdListByGenre = movieBuffObj.getMovieIdListByGenre();
		
		System.out.println("by genre : " +movieIdListByGenre);
		
		List<Integer>  movieIdListByYear = movieBuffObj.getMovieIdListByyear();
		System.out.println("by year : " +movieIdListByYear);
		
		List<Integer>  movieIdListByYearAndGenre= movieBuffObj.getMovieIdListByYearAndGenre(movieIdListByGenre,movieIdListByYear);
				
		System.out.println("by year and genre"+movieIdListByYearAndGenre);
	
	
		System.out.println(movieBuffObj.mostWatchedUserId());
	*/	
		
		/*MovieManager movieManagerObj = new FileHandlingParser("movieEdit.data","genreEdit.data","userEdit.data","ratingsEdit.data");
		
		MovieBuff movieBuffObj  = new MovieBuff(movieManagerObj);
		*/
		
		/*UserParser userParserObj = new UserParser("userEdit.data");
		 
		Map <Integer,User> userData = userParserObj.getUserData();	
		*/
		//System.out.println(userData); 
		
		/*MovieParser movieParserObj = new MovieParser("MovieEdit.data");
		 
		Map<Integer, Movie> userData = movieParserObj.getMovieData();	
		
		System.out.println(userData); 
		*/
		
		
		LOGGER.info("Work Completed");
	}
}