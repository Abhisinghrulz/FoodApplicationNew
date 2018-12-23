package com.restaurant.Restaurant.dao;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RestaurantId")
	private Integer restaurantId;

	@Column(name = "RestaurantName")
	private String restaurantName;

	@Column(name = "RestaurantRating")
	private Integer restaurantRating;

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "restaurantDishesCollection", joinColumns
	 * = @JoinColumn(name = "Restaurant_Id"), inverseJoinColumns = @JoinColumn(name
	 * = "RtDish_Id")) private Collection<Dishes> restaurantDishesCollection = new
	 * ArrayList<>();
	 */

	/**
	 * Check whether FetchType lazy is working or not . Select query for Dishes
	 * should be fired only when getCall is made for List<Dishes>.
	 */
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "restaurant", fetch = FetchType.LAZY, orphanRemoval = true)
	@JsonManagedReference
	private Collection<Dishes> restaurantDishesCollection;

	public Restaurant() {
	}

	public Restaurant(String restaurantName, Integer restaurantRating, Collection<Dishes> restaurantDishesCollection) {
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

	public Collection<Dishes> getRestaurantDishesCollection() {
		return restaurantDishesCollection;
	}

	public void setRestaurantDishesCollection(Collection<Dishes> restaurantDishesCollection) {
		this.restaurantDishesCollection = restaurantDishesCollection;
	}
}
