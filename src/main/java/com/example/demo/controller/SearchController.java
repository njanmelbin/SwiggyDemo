package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurant;
import com.example.demo.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	SearchService searchService;
	
	
	@RequestMapping(method=RequestMethod.GET,path="/search")
	public List<Restaurant> search(){
		return searchService.retrieveAll();
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/search/{keyword}")
	public List<Restaurant> search(@PathVariable(value = "keyword") String keyword){
		return searchService.retrieveByTag(keyword);
	}

}
