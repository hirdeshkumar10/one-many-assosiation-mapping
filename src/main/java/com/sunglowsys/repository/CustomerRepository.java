package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer save(Customer customer);

    Customer update(Customer customer,Long id);

    Customer findById(Long id);

    List<Customer> findAll();

    void delete(Long id);
}
