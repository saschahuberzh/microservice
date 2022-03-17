package cts.sh.RatingService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cts.sh.RatingService.model.Rating;
import cts.sh.RatingService.model.RatingListResponse;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	
	
	@GetMapping
	public RatingListResponse getAllRatings(){
		List<Rating> l = new ArrayList<Rating>();
		l.add(new Rating(1, 4, 1234));
		l.add(new Rating(2, 3, 5678));
		return new RatingListResponse(l);
	}
	
	@GetMapping("/{id}")
	public Rating findById(@PathVariable("id") int id) {
		return new Rating(id, 4, 1234);
	}
	
	@GetMapping("/byBook/{id}")
	public RatingListResponse findByBookId(@PathVariable("id") int id){
		List<Rating> l = new ArrayList<Rating>();
		l.add(new Rating(1, 4, id));
		l.add(new Rating(2, 3, id));
		return new RatingListResponse(l);
	}
}
