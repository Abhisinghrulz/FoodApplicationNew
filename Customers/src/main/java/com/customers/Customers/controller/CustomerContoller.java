package com.customers.Customers.controller;

import com.customers.Customers.dao.Customers;
import com.customers.Customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;

@RestController
public class CustomerContoller
{
    @Autowired
    CustomerService customerService;

    @PostMapping("/addCustomer")
    @ResponseBody
    public void addUser(@RequestBody Customers customers)
    {
        customerService.addCustomers(customers);
    }

    @GetMapping("/allCustomers")
    public Collection<Customers> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }


}
