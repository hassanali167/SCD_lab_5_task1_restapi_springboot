package com.example.order_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// This interface will handle all the database operations for the Order entity.
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Custom method to find all orders by status
    List<Order> findByStatus(String status);

    // You can add more custom queries here if needed, such as retrieving orders by price or product name.
}
