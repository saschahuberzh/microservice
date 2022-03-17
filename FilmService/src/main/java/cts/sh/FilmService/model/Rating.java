package cts.sh.FilmService.model;

public class Rating {
	private int id;
	private int rating;
	private int filmId;
	
	public Rating(int id, int rating, int filmId) {
		super();
		this.id = id;
		this.rating = rating;
		this.filmId = filmId;
	}
	
	public Rating() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	@Override
	public String toString() {
		return "Rating [id=" + id + ", rating=" + rating + ", filmId=" + filmId + "]";
	}
}
