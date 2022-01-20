package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer, Long id) {
        return customerRepository.update(customer,id);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }

    @Override
    public void delete(Long id) {
        customerRepository.delete(id);

    }
}
