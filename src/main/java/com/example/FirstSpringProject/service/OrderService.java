package com.example.FirstSpringProject.service;

import com.example.FirstSpringProject.model.Order;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();
    Random random = new Random();

    public Optional<Order> getOrderById(int id){
        return orders.stream().filter(e -> (e.getId() == id)).findFirst();
    }
    public List<Order> getAll(){
        return this.orders;
    }
    public Order save(Order order){
        order.setId(this.random.nextInt());
        order.setCost(order.getProducts());
        order.setDate(LocalDateTime.now());
        orders.add(order);
        return order;
    }
}
