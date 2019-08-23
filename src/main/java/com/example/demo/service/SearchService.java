package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.model.Restaurant;


@Component
public class SearchService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<Restaurant> retrieveAll() {
		List<Restaurant> restuarants = new ArrayList<Restaurant>();
		
		List<String> tags = new ArrayList<String>();
		tags.add("Sea food");
		tags.add("pasta");
		Restaurant restaurantOne= new Restaurant("Cosatal Aroma",tags);
		
		restuarants.add(restaurantOne);
		
		return restuarants;
	}
	
	public List<Restaurant> retrieveByTag(String tag) {
		
		List<Restaurant> restuarants = new ArrayList<Restaurant>();
	
		logger.info("Anonymous user searched for tag " + tag);
		List<String> tags = new ArrayList<String>();
		tags.add("Sea food");
		tags.add("pasta");
		Restaurant restaurantOne= new Restaurant("Coastal Aroma",tags);
		
		List<String> tagsOne = new ArrayList<String>();
		tagsOne.add("Italian");
		Restaurant restaurantTwo= new Restaurant("Cafe Le",tagsOne);

		Map<String,Restaurant> listOfRestaurants = new HashMap();
		listOfRestaurants.put("Coastal Aroma",restaurantOne);
		listOfRestaurants.put("Cafe Le",restaurantTwo);

		if(listOfRestaurants.containsKey(tag)) {
			restuarants.add(listOfRestaurants.get(tag));
		}
		
		return restuarants;		
		
	}
}
