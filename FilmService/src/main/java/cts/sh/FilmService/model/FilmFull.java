package cts.sh.FilmService.model;

import java.util.ArrayList;
import java.util.List;

public class FilmFull {
	private Film film;
	List<Rating> ratings = new ArrayList<Rating>();
	public FilmFull(Film film, List<Rating> ratings) {
		super();
		this.film = film;
		this.ratings = ratings;
	}
	
	public FilmFull() {
		super();
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "FilmFull [film=" + film + ", ratings=" + ratings + "]";
	}
	
	
}
