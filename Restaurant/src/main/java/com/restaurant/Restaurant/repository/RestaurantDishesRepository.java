package com.restaurant.Restaurant.repository;

import com.restaurant.Restaurant.dao.RestaurantDishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantDishesRepository extends JpaRepository<RestaurantDishes,Integer>
{
}
