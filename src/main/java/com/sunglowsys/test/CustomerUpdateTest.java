package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;

public class CustomerUpdateTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Desctop");
        System.out.println("updated:"+customer);
    }
}
