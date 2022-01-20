package com.sunglowsys.service;

import com.sunglowsys.domain.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);

    Order update(Order order,Long id);

    Order findById(Long id);

    List<Order> findAll();

    void delete(Long id);

}
