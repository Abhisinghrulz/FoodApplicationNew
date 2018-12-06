package com.restaurant.Restaurant.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Restaurant")
public class Restaurant
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RestaurantId")
    private Integer restaurantId;
    @Column(name = "RestaurantName")
    private String restaurantName;
    @Column(name = "RestaurantRating")
    private Integer restaurantRating;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "restaurantDishesCollection", joinColumns = @JoinColumn(name = "Restaurant_Id"), inverseJoinColumns = @JoinColumn(name = "RtDish_Id"))
    private Collection<RestaurantDishes> restaurantDishesCollection = new ArrayList<>();

    public Restaurant() { }

    public Restaurant(String restaurantName, Integer restaurantRating, Collection<RestaurantDishes> restaurantDishesCollection)
    {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantDishesCollection = restaurantDishesCollection;
    }


    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Integer getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(Integer restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public Collection<RestaurantDishes> getRestaurantDishesCollection() {
        return restaurantDishesCollection;
    }

    public void setRestaurantDishesCollection(Collection<RestaurantDishes> restaurantDishesCollection) {
        this.restaurantDishesCollection = restaurantDishesCollection;
    }
}
