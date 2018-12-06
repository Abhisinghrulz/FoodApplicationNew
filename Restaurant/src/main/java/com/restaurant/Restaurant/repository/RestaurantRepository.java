package com.restaurant.Restaurant.repository;

import com.restaurant.Restaurant.dao.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>
{
}
