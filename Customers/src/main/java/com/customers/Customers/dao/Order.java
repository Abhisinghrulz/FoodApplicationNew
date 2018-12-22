package com.customers.Customers.dao;

import javax.persistence.*;

@Entity
@Table(name="Order_New")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)@Column(name = "OrderId")
    private Integer orderId;

    @Column(name = "OrderName")
    private String orderName;

    public Order()
    {

    }

    public Order(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
