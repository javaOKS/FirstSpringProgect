package com.example.FirstSpringProject.service;

import com.example.FirstSpringProject.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();

    public Optional<Order> getOrderById(int id){
        return orders.stream().filter(order -> order.getId() == id).findFirst();
    }
    public List<Order> getAll(){
        return this.orders;
    }

}
