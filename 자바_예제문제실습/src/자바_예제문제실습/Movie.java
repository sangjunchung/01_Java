package 자바_예제문제실습;

public class Movie {
	private String title;
	private String genre;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public Movie() {

	}

	public Movie(String title) {
		this.title = title;
	}
	
	public Movie(String title, String genre) {

		this.title = title;
		this.genre = genre;
	}
}
