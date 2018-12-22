package com.customers.Customers.service;

import com.customers.Customers.dao.Customers;
import com.customers.Customers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    Collection<Customers> customersCollection = new ArrayList<>();

    public void addCustomers(Customers customers)
    {
        customerRepository.save(customers);
    }

    public Collection<Customers> getAllCustomers() {
        customerRepository.findAll().forEach(customersCollection::add);
        return customersCollection;
    }

    public Optional<Customers> getCustomerById(Integer id)
    {
        return customerRepository.findById(id);
    }

    public void deleteCustomersById(Integer id)
    {
        customerRepository.deleteById(id);
    }

    public void deleteAll()
    {
        customerRepository.deleteAll();
    }
}
