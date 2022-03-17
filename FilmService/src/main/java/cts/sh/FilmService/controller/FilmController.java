package cts.sh.FilmService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cts.sh.FilmService.model.Film;
import cts.sh.FilmService.model.FilmFull;
import cts.sh.FilmService.model.RatingListResponse;

@RestController
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping
	public List<Film> getAllFilms(){
		List<Film> l = new ArrayList<Film>();
		l.add(new Film(1, "Harry Potter 1", "My Desc for Harry Potter 1"));
		l.add(new Film(2, "Harry Potter 2", "My Desc for Harry Potter 2"));
		return l;
	}
	
	@GetMapping("/{id}")
	public Film findById(@PathVariable("id") int id) {
		return new Film(id, "Harry Potter 1", "My Desc for Harry Potter 1");
	}
	
	@GetMapping("/full/{id}")
	public FilmFull findFullById(@PathVariable("id") int id) {
		Film film = new Film(id, "Harry Potter 1", "My Desc for Harry Potter 1");
		//RatingListResponse ratings = restTemplate.getForObject("172.17.0.3:8761/ratingService/rating/byBook/"+film.getId(), RatingListResponse.class);
		//RatingListResponse ratings = restTemplate.getForObject("http://ratingService/rating/byBook/"+film.getId(), RatingListResponse.class);
		RatingListResponse ratings = restTemplate.getForObject("http://rating-service.jar:8081/rating/byBook/"+film.getId(), RatingListResponse.class);
		return new FilmFull(film, ratings.getRatings());
	}
}
