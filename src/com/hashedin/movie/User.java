package com.hashedin.movie;
import java.util.Arrays;

/**
 * 
 * @author sourabh
 *contain info related to the user 
 */

public class User {

	private int userId;
	private int age;
	private char gender;
	private String occupation;
	private int timestamp[];

	public User(int i, int j, char c, String string) {
		// TODO Auto-generated constructor stub

	}

	public User(int userId, int age, char gender, String occupation,
			int[] timestamp) {
		super();
		this.userId = userId;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", age=" + age + ", gender=" + gender
				+ ", occupation=" + occupation + ", timestamp="
				+ Arrays.toString(timestamp) + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int[] getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int[] timestamp) {
		this.timestamp = timestamp;
	}

}