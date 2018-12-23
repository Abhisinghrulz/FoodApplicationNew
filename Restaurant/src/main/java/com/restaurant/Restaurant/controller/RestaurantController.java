package com.restaurant.Restaurant.controller;

import com.restaurant.Restaurant.dao.Restaurant;
import com.restaurant.Restaurant.service.RestaurantImpl;
import com.restaurant.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController
{
    @Autowired
    public RestaurantService restaurantService;

    @PostMapping("/addRestaurant")
    public ResponseEntity<String> addRestaurant(@RequestBody Restaurant restaurant)
    {
        restaurantService.addRestaurant(restaurant);
        return new ResponseEntity<String>("Restaurant "+restaurant.getRestaurantName()+"  is added", HttpStatus.OK);
    }

    @GetMapping("/allRestaurants")
    public Collection<Restaurant> getAllRestaurants(){return restaurantService.getAllRestaurants();}

    @GetMapping("/getRestaurantById/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Integer id)
    {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping("deleteRestaurantById/{id}")
    public ResponseEntity<String> deleteRestaurantById(@PathVariable Integer id)
    {
        restaurantService.deleteRestaurantById(id);
        return new ResponseEntity<String>("Restaurant with Restaurant Id -> "+id + " is deleted",HttpStatus.OK);
    }

    @DeleteMapping("/deleteAll")
    public  void deleteAllRestaurants()
    {
        restaurantService.deleteAll();
    }
}
