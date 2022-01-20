package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_name")
    private String orderName ;

    @Column(name = "brand")
    private String brand ;

    @Column(name = "price")
    private Float price ;

    @ManyToOne
    private Customer customer;

    public Order(){}

    public Order(String orderName, String brand, Float price) {
        this.orderName = orderName;
        this.brand = brand;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderName, order.orderName) && Objects.equals(brand, order.brand) && Objects.equals(price, order.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderName, brand, price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
