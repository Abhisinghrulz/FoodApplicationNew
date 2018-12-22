package com.customers.Customers.repository;

import com.customers.Customers.dao.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish,Integer> {
}
