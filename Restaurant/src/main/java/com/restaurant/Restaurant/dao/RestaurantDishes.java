package com.restaurant.Restaurant.dao;

import javax.persistence.*;

@Entity
@Table(name = "RestaurantDishes")
public class RestaurantDishes
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RtDishId")
    private Integer rtDishId;
    @Column(name = "RtDishName")
    private String rtDishName;
    @Column(name = "RtDishPrice")
    private Float rtDishPrice;

    public RestaurantDishes()
    {
    }

    public RestaurantDishes(String rtDishName, Float rtDishPrice)
    {
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
}
