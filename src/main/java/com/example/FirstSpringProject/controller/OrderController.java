package com.example.FirstSpringProject.controller;

import com.example.FirstSpringProject.model.Order;
import com.example.FirstSpringProject.model.Product;
import com.example.FirstSpringProject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Integer id){
        return this.orderService.getOrderById(id).orElseThrow();
    }
    @GetMapping
    public List<Order> getOrders(){
        return this.orderService.getAll();
    }
    @PostMapping
    public Order save(@RequestBody Order order){
       return this.orderService.save(order);
    }

}

