package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.repository.OrderRepositoryImpl;

public class CustomerDeleteTest {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        orderRepository.delete(4L);
    }
}
