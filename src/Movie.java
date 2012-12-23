import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Movie implements MatrixInterface {

	private int movieId;
	private String movieName;
	private int genre[];
	private String date;

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName
				+ ", genre=" + Arrays.toString(genre) + ", date=" + date + "]";
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int[] getGenre() {
		return genre;
	}

	public void setGenre(int[] genre) {
		this.genre = genre;

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Movie(int movieId, String movieName, int[] genre, String date) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.date = date;
	}

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Integer> getMovieIdList() {
		// TODO Auto-generated method stub

		Parsing movieObj1 = new Parsing();

		Map<Integer, Movie> movieData = movieObj1.getMovieData();

		Scanner in1 = new Scanner(System.in);
		int genreInput;
		System.out.println("Enter genre ID \t");
		genreInput = in1.nextInt();

		List<Integer> MovieIdList = new ArrayList<Integer>();

		for (Movie k : movieData.values()) {

			if (k.getGenre()[genreInput] == 1) {
				MovieIdList.add(k.getMovieId());

			}

		}
		return MovieIdList;

	}

	@Override
	public String getTopMovieByGenre(List<Integer> MovieIdList) {
		// TODO Auto-generated method stub
		return null;
	}

}
