package com.restaurant.Restaurant.Model;

public class DishDto {

	private Integer rtDishId;

	private String rtDishName;

	private Float rtDishPrice;

	private Integer restaurant;

	public DishDto(String rtDishName, Float rtDishPrice, Integer restaurant)
	{
		this.rtDishName = rtDishName;
		this.rtDishPrice = rtDishPrice;
		this.restaurant = restaurant;
	}

	public DishDto()
	{

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

	public Integer getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Integer restaurant) {
		this.restaurant = restaurant;
	}

}
