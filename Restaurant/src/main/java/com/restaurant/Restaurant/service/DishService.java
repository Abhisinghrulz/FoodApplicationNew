package com.restaurant.Restaurant.service;

import org.springframework.stereotype.Service;

import com.restaurant.Restaurant.Model.DishDto;

@Service
public interface DishService {

	void addDish(DishDto dishDto) throws Exception;

	
	
}
