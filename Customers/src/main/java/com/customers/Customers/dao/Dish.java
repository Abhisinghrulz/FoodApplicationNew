package com.customers.Customers.dao;

import javax.persistence.*;

@Entity
@Table(name = "Dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)@Column(name = "DishId")
    private Integer dishId;
    @Column(name = "DishName")
    private String dishName;

    public Dish()
    {

    }

    public Dish(String dishName) {
        this.dishName = dishName;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
}
