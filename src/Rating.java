
import java.util.List;

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
	public List<Integer> getMovieRatingList(List <Integer> movieIdList) {
		// TODO Auto-generated method stub
		
		
		
		
		return null;
	}

}
