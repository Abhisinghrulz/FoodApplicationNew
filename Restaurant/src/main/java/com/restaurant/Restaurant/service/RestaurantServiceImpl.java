package com.restaurant.Restaurant.service;

import com.restaurant.Restaurant.dao.Restaurant;
import com.restaurant.Restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService
    {
        @Autowired
        RestaurantRepository restaurantRepository;

        Collection<Restaurant> restaurants = new ArrayList<>();

        public void addRestaurant(Restaurant restaurant) { restaurantRepository.save(restaurant);}

        public Collection<Restaurant> getAllRestaurants()
        {
            restaurantRepository.findAll().forEach(restaurants::add);
            return restaurants;
        }

        public Optional<Restaurant> getRestaurantById(Integer id)
        {
            return restaurantRepository.findById(id);
        }

        public void deleteRestaurantById(Integer id)
        {
            restaurantRepository.deleteById(id);
        }

        public void deleteAll()
        {
            restaurantRepository.deleteAll();
        }
    }
