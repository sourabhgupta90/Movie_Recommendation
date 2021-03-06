package com.hashedin.model;

/**
 * 
 * @author sourabh
 * @see contains the Genre Of Movies
 * 
 */

public enum Genre {
	UNKNOWN(0), ACTION(1), ADVENTURE(2), ANIMATION(3), CHILDREN(4), COMEDY(5), CRIME(
			6), DOCUMENTARY(7), DRAMA(8), FANTASY(9), FILM_NOIR(10), HORROR(11), MUSICAL(
			12), MYSTERY(13), ROMANCE(14), SCI_FI(15), THRILLER(16), WAR(17), WESTERN(
			18);

	private int code;

	private Genre(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *            taking the integer value as input
	 * @return genre object
	 */
	public static Genre fromCode(int code) {

		for (Genre g : Genre.values()) {
			if (g.getCode() == code) {
				return g;
			}
		}
		return null;

	}

}