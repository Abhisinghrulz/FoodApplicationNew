package com.customers.Customers.dao;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "CustomerCart")
public class CustomerCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)@Column(name = "CustomerCartId")
    private Integer customerCartId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CustomerCart_Dish", joinColumns = @JoinColumn(name = "CustomerId"), inverseJoinColumns = @JoinColumn(name = "DishId"))
    private Collection<Dish> dishes = new ArrayList<>();

    public CustomerCart()
    {

    }

    public CustomerCart(Collection<Dish> dishes) {
        this.dishes = dishes;
    }

    public Integer getCustomerCartId() {
        return customerCartId;
    }

    public void setCustomerCartId(Integer customerCartId) {
        this.customerCartId = customerCartId;
    }

    public Collection<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Collection<Dish> dishes) {
        this.dishes = dishes;
    }
}
