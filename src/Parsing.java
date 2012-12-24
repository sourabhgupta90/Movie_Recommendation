import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parsing {

	public Map<Integer, Movie> getMovieData() {

		/*
		Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();
		
		int intArray1[] = { 1, 0, 1, 0 };
		int intArray2[] = { 1, 1, 1, 0 };
		int intArray3[] = { 1, 0, 1, 0 };

		Movie movie1 = new Movie(1, "silence1", intArray1, "12 dec 20121");
		Movie movie2 = new Movie(2, "silence2", intArray2, "12 dec 20122");
		Movie movie3 = new Movie(3, "silence3", intArray3, "12 dec 20123");

		movieData.put(movie1.getMovieId(), movie1);
		movieData.put(movie2.getMovieId(), movie2);
		movieData.put(movie3.getMovieId(), movie3);

		return movieData;
		
		*/
		
		////////////////////////////////////////////////////////////////////////////////////////
		Map<Integer, Movie> movieData = new HashMap<Integer, Movie>();	
		
		Movie movie1 = new Movie();
		try
        {
                
				
						
				FileInputStream fstream = new FileInputStream("movieEdit.data");

                DataInputStream in = new DataInputStream(fstream);
                
                
                while (in.available() !=0)
                {
                	
                	String str1 = in.readLine();
                	String s[] = str1.split("[|]+");
    				
                	
                	movie1.setMovieId(Integer.valueOf(s[0]));
                	movie1.setMovieName(s[1]);
                	movie1.setDate(s[2]);
                	
                	int genreArray[]  =  new int [19] ;
                	
                	for(int t  = 0 ; t < genreArray.length; t++){
    					genreArray[t] = Integer.valueOf(s[4+t]);
                	}
                	
                	movie1.setGenre(genreArray);
                	System.out.println(movie1);
                	movieData.put(movie1.getMovieId(), movie1);
                
                }
                in.close();
        } 
        catch (Exception e)
        {
        	System.err.println("input file does not exists");
        }	
		return movieData;
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

	public Map<Integer, User> getUserData() {

		Map<Integer, User> UserData = new HashMap<Integer, User>();

		User User1 = new User(1, 23, 'M', "Engineer");
		UserData.put(3, User1);

		return UserData;

	}

	public List<Rating> getRating() {

		/*
		 * List<Rating> userRating = new ArrayList<Rating>();
		 * 
		 * Rating r1 = new Rating(1, 1, 2, 42131); Rating r2 = new Rating(2,
		 * 2,3, 42131); Rating r3 = new Rating(3, 3, 3, 42131); Rating r4 = new
		 * Rating(4, 2, 1, 42131);
		 * 
		 * userRating.add(r1); userRating.add(r2); userRating.add(r3);
		 * userRating.add(r4); return userRating;
		 */
		List<Rating> userRating = new ArrayList<Rating>();
        Rating ratingObj = new Rating();
		
        try
        {
                
                FileInputStream fstream = new FileInputStream("ratingsEdit.data");

                DataInputStream in = new DataInputStream(fstream);
                
                
                while (in.available() !=0)
                {
                	
                	String str1 = in.readLine();
                	
    				String s[] = str1.split("\t");
    				
    				
    				ratingObj.setUserId(Integer.valueOf(s[0]));
    				ratingObj.setMovieId(Integer.valueOf(s[0]));
    				ratingObj.setRating(Integer.valueOf(s[0]));
    				ratingObj.setTimestamp(Integer.valueOf(s[0]));
    			
    				userRating.add(ratingObj);
    				
                }
                in.close();
        } 
        catch (Exception e)
        {
        	System.err.println("input file does not exists");
        }	
		return userRating;
	}

}
