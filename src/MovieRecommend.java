import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MovieRecommend {

	public static void main(String args[]) {

		/*
		 * 1. Parsing the data 2. Short the file 3. Method of top movie by genre
		 * 4. first parsing than question.
		 */

		Parsing parserUserObj = new Parsing();
		Map<Integer, User> userData = parserUserObj.getUserData();
		// System.out.println(userData);

		Parsing parserMovieObj = new Parsing();
		Map<Integer, Movie> movieData = parserMovieObj.getMovieData();
		// System.out.println(movieData);

		Parsing parserRatingObj = new Parsing();
		List<Rating> userRating = parserRatingObj.getRating();
		//System.out.println("userRating"+userRating);

		
		///// top movie by genre
		Movie movieObj = new Movie();

		List<Integer> movieIdList = movieObj.getMovieIdList();
		System.out.println("movieIdList " + movieIdList);

		Rating ratingObj = new Rating();
		String topMovieByGenre = ratingObj.getTopMovieByGenre(movieIdList);
		System.out.println("top movie by genre"+topMovieByGenre);
		///////////////
	
	
	
	
	}

}