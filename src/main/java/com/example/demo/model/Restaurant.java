package com.example.demo.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	private String name;
	
	private List<String> types;
	

	public Restaurant() {
		super();
	}


	public Restaurant(String name, List<String> types) {
		
		super();
		UUID id = UUID.randomUUID();
		this.id = id;
		this.name = name;
		this.types = types;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}
	

}
