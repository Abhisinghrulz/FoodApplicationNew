package com.customers.Customers.dao;

import javax.persistence.*;

@Entity
@Table(name="Customers")
public class Customers {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)@Column(name = "CustomerId")
    private Integer customerId;
    @Column(name="CustomerName")
    private String customerName;
    @Column(name = "CustomerAddress")
    private String customerAddress;
    @Column(name = "CustomerBalance")
    private Float customerBalance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CustomerCartId")
    private CustomerCart customerCart;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderId")
    private Order order;
    @Column(name = "FoodStatus")
    private String foodStatus;

    public Customers(String customerName, String customerAddress, Float customerBalance, CustomerCart customerCart, Order order, String foodStatus) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerBalance = customerBalance;
        this.customerCart = customerCart;
        this.order = order;
        this.foodStatus = foodStatus;
    }

    public Customers()
    {

    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Float getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(Float customerBalance) {
        this.customerBalance = customerBalance;
    }

    public CustomerCart getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(CustomerCart customerCart) {
        this.customerCart = customerCart;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(String foodStatus) {
        this.foodStatus = foodStatus;
    }





}
