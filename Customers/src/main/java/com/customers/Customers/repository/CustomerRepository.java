package com.customers.Customers.repository;

import com.customers.Customers.dao.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Integer>{
}
