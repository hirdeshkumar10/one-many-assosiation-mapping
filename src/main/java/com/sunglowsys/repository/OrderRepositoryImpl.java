package com.sunglowsys.repository;

import com.sunglowsys.domain.Order;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{

    private  static  final Logger LOGGER = LoggerFactory.getLogger(OrderRepositoryImpl.class);

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    @Override
    public Order save(Order order) {
        LOGGER.debug("saving Order: {}",order);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(order);
        Order order1 = session.get(Order.class, id);
        session.close();
        return order1;
    }

    @Override
    public Order update(Order order, Long id) {
        LOGGER.debug("updating: {}",order);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order1 = session.get(Order.class,id);
        order1.setOrderName(order.getOrderName());
        session.update(order);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public Order findById(Long id) {
        LOGGER.debug("finding one id: {}", id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class, id);
        session.getTransaction().commit();
        session.close();
        return order;
    }

    @Override
    public List<Order> findAll() {
        LOGGER.debug("finding to all:");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Order");
        List<Order> orderList = query.list();
        return orderList;
    }

    @Override
    public void delete(Long id) {
        LOGGER.debug("deleting: {}",id);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = session.get(Order.class,id);
        session.delete(order);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted:"+order);

    }
}
