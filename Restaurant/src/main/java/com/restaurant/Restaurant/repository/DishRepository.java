package com.restaurant.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.Restaurant.dao.Dishes;

@Repository
public interface DishRepository extends JpaRepository<Dishes,Integer>
{
}
