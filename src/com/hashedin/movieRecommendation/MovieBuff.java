package com.hashedin.movieRecommendation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.hashedin.model.Genre;
import com.hashedin.model.Movie;
import com.hashedin.model.Rating;


public class MovieBuff {
	
	private MovieManager movieManagerObj;
	
	
	public MovieBuff(MovieManager movieManagerObj2) {
		// TODO Auto-generated constructor stub
		this.movieManagerObj = movieManagerObj2; //check by the sir
	}

	public String getTopMovieByGenre(){
		return null;
	}
	
	public String getTopMovieByYear(){
		
		return null;
	}
	
	public String getMostWatchedMovieName() {
		
		List<Rating> ratingListObj = new ArrayList<Rating>();
		
		ratingListObj = movieManagerObj.getMovieDatabase().getRatingList(); 
		
		
		Integer watchedCount [] = new Integer [5];
	
		for(int t = 0 ; t < watchedCount.length ; t++){
			watchedCount[ t ] = 0;
		}
		
		for(int t = 0 ; t < ratingListObj.size() ; t++){
			
			watchedCount [ ratingListObj.get(t).getMovieObj().getMovieId() ] += 1; 
			
			//System.out.println("here"+ ratingListObj.get(t).getMovieObj().getMovieId());
			//System.out.println("here"+watchedCount[t]);
		}
		
		
		Integer mostWatchedMovie = watchedCount[0];
		
		for(int t = 0 ; t < watchedCount.length; t++){
			
			if( watchedCount[t] > mostWatchedMovie ){
				
				mostWatchedMovie = watchedCount[t]; 
			}
			//System.out.println( watchedCount[t] );
		}
		//System.out.print("here"+mostWatchedMovie);
		
		return ratingListObj.get(mostWatchedMovie).getMovieObj().getMovieName();
	}

	
	public List<Integer> getMovieIdListByGenre() {
				
		Scanner in1 = new Scanner(System.in);
		int genreInput;
		System.out.println("Enter genre ID e.g 0 1 2 3 \t");
		genreInput = in1.nextInt();

		List<Integer> MovieIdList = new ArrayList<Integer>();
		
		/**
		 *	Match the specified genre from movie 
		 */
		
		List<Rating> ratingListObj = new ArrayList<Rating>();
		
		ratingListObj = movieManagerObj.getMovieDatabase().getRatingList(); 
		
		for(Rating ratingObj : ratingListObj)
		{
			Genre g = null;
			
			if(ratingObj.getMovieObj().getGenreobj().contains( g.fromCode(genreInput) )){
				
				MovieIdList.add(ratingObj.getMovieObj().getMovieId());
			}
		}
		
		//System.out.println(MovieIdList);
		return MovieIdList;
		
		
	}
	public List<Integer> getMovieIdListByyear() {
		
		Scanner scan = new Scanner(System.in);
		String yearInput;
		System.out.println("Enter the year  \t");
		yearInput = scan.next();

		List<Integer> MovieIdList = new ArrayList<Integer>();
		
		/**
		 *	Match the specified genre from movie 
		 */
		
		List<Rating> ratingListObj = new ArrayList<Rating>();
		
		ratingListObj = movieManagerObj.getMovieDatabase().getRatingList(); 
		
		//System.out.print(ratingListObj.size());
		for(Rating ratingObj : ratingListObj)
		{
			int stringLength = ratingObj.getMovieObj().getDate().length();
			String year = ratingObj.getMovieObj().getDate().substring(stringLength - 4, stringLength);
			
			
			if(year.equals(yearInput)){
				
				MovieIdList.add(ratingObj.getMovieObj().getMovieId());
			}
		}
		
		return MovieIdList;
		
	}

	
	
	public String getTopMovieRatingName(List<Integer> movieIdList) {
		// TODO Auto-generated method stub

		List<Rating> ratingListObj = new ArrayList<Rating>();
		
		ratingListObj = movieManagerObj.getMovieDatabase().getRatingList(); 
		
		
		
		List<Float> movieRatingList = new ArrayList<Float>();
		
		for(Integer movieId : movieIdList){
			
			int ratingval = 0;
			int count = 0;

			
			for(Rating ratingObj : ratingListObj){
				if( movieId == ratingObj.getMovieObj().getMovieId()){
					count++;
					ratingval = ratingval + ratingObj.getRating(); 
					
				}
			}
			movieRatingList.add((float)ratingval/count);
			ratingval = 0;
			count = 0;
		
		}
				
		float max = movieRatingList.get(0);
		int maxRatingMovie = 0;
		
		/**
		 * finding max rating movie
		 */
		
		
		for (int t = 1; t < movieRatingList.size(); t++) {
			if (max < movieRatingList.get(t)) {
				max = movieRatingList.get(t);
				maxRatingMovie = t;
			}
		}
		maxRatingMovie = movieIdList.get(maxRatingMovie);
		
		System.out.println("maxRatingMovie :" + maxRatingMovie);
        
		/**
		 *extracting the name of highest rating movie 
		 */
		
		
		for ( Rating key : ratingListObj ) {
			if (key.getMovieObj().getMovieId() == maxRatingMovie) {
				System.out.print(key.getMovieObj().getMovieName());
				return key.getMovieObj().getMovieName();
			}
		}

		return null;
	}
	
	public List<Integer> getMovieIdListByYearAndGenre(List<Integer> movieIdListByGenre, List<Integer> movieIdListByYear) {
		
		 
		List<Integer> movieIdListByGenreAndYear = new ArrayList<Integer>();
		
		for(Integer IdByYear :movieIdListByYear){
			for(Integer IdByGenre : movieIdListByGenre ){
				if(IdByYear==IdByGenre){
					movieIdListByGenreAndYear.add(IdByYear);
					break;
				}
			
			}
			
		}
		
		return movieIdListByGenreAndYear;
	}
	public int mostWatchedUserId(){
		
		List<Rating> ratingListObj = new ArrayList<Rating>();
		
		ratingListObj = movieManagerObj.getMovieDatabase().getRatingList(); 
		
		Integer logins[] = new Integer[4];
		
		for(int loginIndex = 0 ; loginIndex < logins.length ; loginIndex++){
			logins[loginIndex] = 0;
		}
		
		for (Rating ratingObj : ratingListObj) {
		    
			logins[ratingObj.getUserObj().getUserId()]++;
			//System.out.println("Key = " + ratingObj.getUserObj().getUserId());
		
		}
		
		int activeUserId = ratingListObj.get(0).getUserObj().getUserId();
		int maxLogins = logins[0];
		
		for (Rating ratingObj : ratingListObj) {
		    
			if(maxLogins < logins[ratingObj.getUserObj().getUserId()] ){
				
				maxLogins = logins[ratingObj.getUserObj().getUserId()];
				
				activeUserId  = ratingObj.getUserObj().getUserId(); 		
			}
		}
		return activeUserId;
	}

}
