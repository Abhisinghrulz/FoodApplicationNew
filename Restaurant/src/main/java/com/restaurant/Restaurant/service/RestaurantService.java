package com.restaurant.Restaurant.service;

import com.restaurant.Restaurant.dao.Restaurant;
import com.restaurant.Restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public interface RestaurantService
{
    void addRestaurant(Restaurant restaurant);

    Collection<Restaurant> getAllRestaurants();

    Optional<Restaurant> getRestaurantById(Integer id);

    void deleteRestaurantById(Integer id);

    void deleteAll();
}
