package com.restaurant.Restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.Restaurant.Model.DishDto;
import com.restaurant.Restaurant.service.DishService;

@RestController
@RequestMapping("/dishes")
public class DishesController {

	@Autowired
	public DishService dishService;

	@PostMapping("/addDish")
	public ResponseEntity addDish(@RequestParam DishDto dishDto) throws Exception {
		dishService.addDish(dishDto);
		return null;
	}

}
