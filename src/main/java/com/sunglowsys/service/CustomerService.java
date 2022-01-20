package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer update(Customer customer,Long id);

    Customer findById(Long id);

    List<Customer> findAll();

    void delete(Long id);
}
