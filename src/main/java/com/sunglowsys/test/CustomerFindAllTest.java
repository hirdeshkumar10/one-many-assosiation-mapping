package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepositoryImpl;

public class CustomerFindAllTest {
    public static void main(String[] args) {
        System.out.println(new CustomerRepositoryImpl().findAll());
    }
}
