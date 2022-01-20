package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepositoryImpl;

public class CustomerFindByIdTest {
    public static void main(String[] args) {
        System.out.println(new CustomerRepositoryImpl().findById(1L));
    }
}
