package com.hashedin.parser;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.hashedin.model.User;
import com.hashedin.movieRecommendation.MovieRecommend;


public class UserParser {


	private String userFileName;
	public static final Logger LOGGER = Logger.getLogger(MovieRecommend.class);
	
	public Map<Integer,User> getUserData(){
		
		Map<Integer, User> userData = new HashMap<Integer, User>();

		User userObj = new User();
		
		try {

			FileInputStream fstream = new FileInputStream(userFileName);

			DataInputStream in = new DataInputStream(fstream);

			while (in.available() != 0) {

				// split the Inputline into tokens

				String inputLine = in.readLine();
				
				String tokens[] = inputLine.split("[|]+");
				
				
				userObj.setAge(Integer.valueOf(tokens[1]));
				
				userObj.setGender( tokens[2].charAt(0) );
				
				userObj.setOccupation(tokens[3]);
				
				userObj.setUserId(Integer.valueOf(tokens[0]));
				
				userData.put(userObj.getUserId(), userObj);
				//System.out.print(userData);
				
			}
			in.close();
		} catch (Exception e) {
			LOGGER.error("Error in parsing");
			//System.err.println("input file does not exists");
		}
		LOGGER.info("parsing is complete");
		return userData;
		
		//return null;
		
		
	}
	
	public String getUserFileName() {
		return userFileName;
	}

	public void setUserFileName(String userFileName) {
		this.userFileName = userFileName;
	}

	@Override
	public String toString() {
		return "UserParser [userFileName=" + userFileName + "]";
	}

	public UserParser(String userFileName) {
		super();
		this.userFileName = userFileName;
	}

	








}
