package com.company.lesson3.repository;

import com.company.lesson3.entity.Order;

public class OrderRepository {

    private Order[] orders;

    public OrderRepository(Order[] orders) {
        this.orders = orders;
    }

    public Order findOrderById(Long id) {
        for (Order order : orders) {
            if (order.getOrderId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public Order findOrderByUser(Long userId) {
        for (Order order : orders) {
            if (order.getUser().getUserId().equals(userId)) {
                return order;
            }
        }
        return null;
    }
}
