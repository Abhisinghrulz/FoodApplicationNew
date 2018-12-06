package com.restaurant.Restaurant.controller;

import com.restaurant.Restaurant.dao.Restaurant;
import com.restaurant.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void addRestaurant(@RequestBody Restaurant restaurant){ restaurantService.addRestaurant(restaurant);}

    @GetMapping("/allRestaurants")
    public Collection<Restaurant> getAllRestaurants(){return restaurantService.getAllRestaurants();}

    @GetMapping("/getRestaurantById/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Integer id)
    {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping("deleteRestaurantById/{id}")
    public void deleteRestaurantById(@PathVariable Integer id){ restaurantService.deleteRestaurantById(id);}

    @DeleteMapping("/deleteAll")
    public  void deleteAllRestaurants(){
        restaurantService.deleteAll();
    }
}
