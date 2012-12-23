import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Rating implements MatrixInterface {

	private int userId;
	private int movieId;
	private int rating;
	private int timestamp;

	public Rating(int userId, int movieId, int rating, int timestamp) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.timestamp = timestamp;
	}

	public Rating() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", movieId=" + movieId
				+ ", rating=" + rating + ", timestamp=" + timestamp + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public List<Integer> getMovieIdList() {

		return null;
	}

	@Override
	public String getTopMovieByGenre(List<Integer> movieIdList) {
		// TODO Auto-generated method stub
		
		Parsing parserRatingObj = new Parsing();
		List<Rating> userRating = parserRatingObj.getRating();
		
		Parsing parserMovieObj = new Parsing();
		Map<Integer, Movie> movieData = parserMovieObj.getMovieData();
		Iterator<Integer> itr1 = movieIdList.iterator();

		List<Float> movieRatingList = new ArrayList<Float>();

		int movieIdIndex = 0;
		while (itr1.hasNext()) {

			Iterator<Rating> itr2 = userRating.iterator();

			int ratingval = 0;
			int count = 0;

			System.out.println(movieIdList.get(movieIdIndex));

			int userRatingIndex = 0;

			while (itr2.hasNext()) {

				// System.out.println("user rating "+userRating.get(userRatingIndex).getMovieId());

				if (movieIdList.get(movieIdIndex) == userRating.get(
						userRatingIndex).getMovieId()) {
					ratingval += userRating.get(userRatingIndex).getRating();
					count++;
				}
				userRatingIndex++;
				itr2.next();

			}

			// System.out.println(ratingval);
			movieRatingList.add((float) ratingval / count);
			ratingval = 0;
			count = 0;
			itr1.next();
			movieIdIndex++;

		}
		// System.out.println("movieId"+movieRatingList);
		float max = movieRatingList.get(0);
		int maxRatingMovie = 0;
		for (int t = 1; t < movieRatingList.size(); t++) {
			if (max < movieRatingList.get(t)) {
				max = movieRatingList.get(t);
				maxRatingMovie = t;
			}
		}
		maxRatingMovie = movieIdList.get(maxRatingMovie);
		System.out.println("maxRatingMovie :" + maxRatingMovie);

		for (Integer key : movieData.keySet()) {
			if (key == maxRatingMovie) {
				System.out.println("Name of "
						+ movieData.get(key).getMovieName());
				return movieData.get(key).getMovieName();
			}
		}
		
		return null;
	}

}
