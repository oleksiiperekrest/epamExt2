package com.company.lesson3.service;

import com.company.lesson3.entity.Order;
import com.company.lesson3.repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findOrderById(Long id) {
        return orderRepository.findOrderById(id);
    }

    public Order findOrderByUser(Long userId) {
        return orderRepository.findOrderByUser(userId);
    }
}
