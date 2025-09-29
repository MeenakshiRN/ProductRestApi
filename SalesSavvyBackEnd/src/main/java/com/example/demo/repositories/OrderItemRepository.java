package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
	@Query("Select oi from OrderItem oi where oi.order.orderId = :orderId")
	List<OrderItem> findByOrderId(String orderId);
	
	@Query("SELECT oi from OrderItem oi where oi.order.userId = :userId and oi.order.status = 'SUCCESS'")
	List<OrderItem> findSuccessfulOrderItemsByUserId(int userId);

}
