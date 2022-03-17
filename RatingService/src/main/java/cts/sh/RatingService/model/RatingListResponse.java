package cts.sh.RatingService.model;

import java.util.List;

public class RatingListResponse {
	private List<Rating> ratings;

	public RatingListResponse(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}
	

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "RatingListResponse [ratings=" + ratings + "]";
	}
	
}
