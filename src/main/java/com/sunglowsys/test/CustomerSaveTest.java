package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.service.CustomerServiceImpl;
import com.sunglowsys.service.OrderServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CustomerSaveTest {
    public static void main(String[] args) {

        Order order1 = new Order("Bike","hero",90000F);
        Order order2 = new Order("car","thar",2500000F);

        Customer customer = new Customer("hirdesh","Kumar","hk@gmail.com","7987978698");
        Customer result =  new CustomerServiceImpl().save(customer);
        System.out.println("Saved:"+result);

        order1.setCustomer(result);
        order2.setCustomer(result);

        Order result1 = new OrderServiceImpl().save(order1);
        System.out.println("Saved:"+result1);

        Order result2 = new OrderServiceImpl().save(order2);
        System.out.println("Saved:"+result2);
    }
}
