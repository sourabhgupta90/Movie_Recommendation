import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MovieRecommend {

	public static void main(String args[]) {

		/*
		 * 1. Parsing the data 2. Short the file 3. Method of top movie by genre
		 */

		Parsing userObj = new Parsing();
		Map<Integer, User> userData = userObj.getUserData();
		//System.out.println(userData);

		Parsing movieObj = new Parsing();
		Map<Integer, Movie> movieData = movieObj.getMovieData();
		//System.out.println(movieData);

		Parsing ratingObj = new Parsing();
		List<Rating> userRating = ratingObj.getRating();
		//System.out.println("userRating"+userRating);

		// top movie by genre
		Movie obj = new Movie();
		
		List<Integer> movieIdList = obj.getMovieIdList();
		System.out.println("movieIdList " + movieIdList);

		Iterator<Integer> itr1 = movieIdList.iterator();

		List<Float> movieRatingList = new ArrayList<Float>();
		
		int movieIdIndex = 0;
		while (itr1.hasNext()) {
			
			Iterator<Rating> itr2 = userRating.iterator();
			
			int ratingval = 0;
			int count = 0;
			
		    System.out.println(movieIdList.get(movieIdIndex));
		    
		    int userRatingIndex = 0;
			
		    while(itr2.hasNext()){
				
				//System.out.println("user rating "+userRating.get(userRatingIndex).getMovieId());
				
				
				if ( movieIdList.get(movieIdIndex) == userRating.get(userRatingIndex).getMovieId() ) {
					ratingval += userRating.get(userRatingIndex).getRating();
					count++;
				}
				userRatingIndex++;
				itr2.next();
				
			}
			
		    //System.out.println(ratingval);
			movieRatingList.add((float)ratingval/count);
			ratingval = 0;count =0;
			itr1.next();movieIdIndex++;
		    
		}
		//System.out.println("movieId"+movieRatingList);
		float max = movieRatingList.get(0);
		int maxRatingMovie = 0;
		for(int t = 1 ;t < movieRatingList.size(); t++){
			if(max < movieRatingList.get(t)){
				max = movieRatingList.get(t);
				maxRatingMovie = t;
			}
		}
		maxRatingMovie = movieIdList.get(maxRatingMovie);
		System.out.println("maxRatingMovie :"+maxRatingMovie);
	
		
		
		
		for (Integer key : movieData.keySet()) {
		    if(key == maxRatingMovie){
		    	System.out.println("Name of "+movieData.get(key).getMovieName());
		    }
		}
		
		
		
		
	
	}

}