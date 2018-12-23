package com.restaurant.Restaurant.dao;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "RestaurantDishes")
public class Dishes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RtDishId")
	private Integer rtDishId;

	@Column(name = "RtDishName")
	private String rtDishName;

	@Column(name = "RtDishPrice")
	private Float rtDishPrice;
	/**
	 * Added new mapping for Bidirectional Mapping.
	 */
	//@Column(name = "restaurant")
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "RestaurantId")
	@JsonBackReference
	private Restaurant restaurant;

	public Dishes() {
	}

	public Dishes(String rtDishName, Float rtDishPrice) {
		this.rtDishName = rtDishName;
		this.rtDishPrice = rtDishPrice;
	}

	public Integer getRtDishId() {
		return rtDishId;
	}

	public void setRtDishId(Integer rtDishId) {
		this.rtDishId = rtDishId;
	}

	public String getRtDishName() {
		return rtDishName;
	}

	public void setRtDishName(String rtDishName) {
		this.rtDishName = rtDishName;
	}

	public Float getRtDishPrice() {
		return rtDishPrice;
	}

	public void setRtDishPrice(Float rtDishPrice) {
		this.rtDishPrice = rtDishPrice;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
}
