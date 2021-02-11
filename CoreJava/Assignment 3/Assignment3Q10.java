

import java.util.*;

class MovieDetails {

	private String movie;
	private String actor;
	private String actress;
	private String genre;

	public MovieDetails(String movie, String actor, String actress, String genre) {
		this.movie = movie;
		this.actor = actor;
		this.actress = actress;
		this.genre = genre;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actor, actress, genre, movie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		return Objects.equals(actor, other.actor) && Objects.equals(actress, other.actress)
				&& Objects.equals(genre, other.genre) && Objects.equals(movie, other.movie);
	}

	public Object getMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMovie() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

class TheSort implements Comparator<MovieDetails> {

	String sortBy = "";

	public TheSort(String sortBy) {
		this.sortBy = sortBy;
	}

	@Override
	public int compare(MovieDetails m1, MovieDetails m2) {
		MovieDetails s1 = (MovieDetails) m1;
		MovieDetails s2 = (MovieDetails) m2;
		if (this.sortBy.equals("movie")) {
			return s1.getMovie().compareTo(s2.getMovie());
		}
		if (this.sortBy.equals("actor")) {
			return s1.getActor().compareTo(s2.getActor());
		}
		if (this.sortBy.equals("actress")) {
			return s1.getActress().compareTo(s2.getActress());
		}
		return s1.getGenre().compareTo(s2.getGenre());
	}
}

public class Assignment3Q10 {
	public static void main(String[] args) {

		MovieDetails movie1 = new MovieDetails("Harry Potter", "Daniel Radcliff", "Emma Watson", "Sci-Fi");
		MovieDetails movie2 = new MovieDetails("Just go with it", "Adam Sandler", "Jeniffer Anistone", "RomCom");
		MovieDetails movie3 = new MovieDetails("Before we go", "Chris Evans", "Alice Eve", "RomCom");
		MovieDetails movie4 = new MovieDetails("TopGun", "Tom Cruise", "Kelly", "Action");
		

		Assignment3Q10 assign = new Assignment3Q10();
		
		
		assign.addMovie(movie1);
		assign.addMovie(movie2);
		assign.addMovie(movie3);
		assign.addMovie(movie4);
		
		sort(mDetails, sortAccordingly("movieName"));
		
		printSortedMovieList(mDetails);
		

		System.out.println(assign.find_movie_By_mov_Name("10"));

		System.out.println(assign.find_movie_By_Genre("Action"));
		
		

	}

	public static ArrayList<MovieDetails> mDetails = new ArrayList<>();

	public static void sort(ArrayList<MovieDetails> movieDetails, Comparator<MovieDetails> movieDetailsComparator) {
		Collections.sort(movieDetails, movieDetailsComparator);
	}

	public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails) {
		for (MovieDetails m : movieDetails) {
			System.out.println(m.getMovie());
		}

	}

	public void addMovie(MovieDetails movie) {
		mDetails.add(movie);
	}

	public void removeMovies(String movieName) {
		MovieDetails x = null;
		for (MovieDetails m : mDetails) {
			if (m.getMovie().equals(movieName)) {

				x = m;
				break;
			}
		}
		mDetails.remove(x);
	}

	public void removeAllMovies(List<MovieDetails> movies) {
		mDetails.removeAll(movies);
	}

	public MovieDetails find_movie_By_mov_Name(String movieName) {

		for (MovieDetails m : mDetails) {
			if (m.getMovie().equals(movieName)) {
				return m;
			}
		}
		return null;
	}

	public List<MovieDetails> find_movie_By_Genre(String genre) {
		List<MovieDetails> mGenre = new ArrayList<>();

		for (MovieDetails m : mDetails) {
			if (m.getGenre().equals(genre)) {
				mGenre.add(m);
			}
		}
		return mGenre;
	}

	public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
		Comparator<MovieDetails> mD = (Comparator<MovieDetails>) new TheSort(sortBy);
		return mD;
	}
}	